package com.ticketReservation.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.models.pricesModel;
import com.ticketReservation.models.detailsEntity;


public class pricesDataServiceForRepository implements PricesDataAccessInterface2<pricesModel> {

	@Autowired
	DetailsRepositoryInterface pricesRepository;
	
	private JdbcTemplate jdbcTemplate;             
	
	public pricesDataServiceForRepository (DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate (dataSource);
	}
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public pricesModel getById(long id) {
		detailsEntity entity = pricesRepository.findById(id).orElse(null);
		
		pricesModel model = modelMapper.map(entity, pricesModel.class);
		return model;
	}

	@Override
	public List<pricesModel> getPrices() {
		
		Iterable<detailsEntity> priceEntity = pricesRepository.findAll();
		
		List<pricesModel> models = new ArrayList<pricesModel>();
		
		for(detailsEntity item: priceEntity) {
			models.add(modelMapper.map(item, pricesModel.class));
		}
		return models;
	}

	@Override
	public List<pricesModel> searchPrices(String searchTerm) {
		Iterable<detailsEntity> entities = pricesRepository.findByEventContainingIgnoreCase(searchTerm);
		List<pricesModel> orders = new ArrayList<pricesModel>();
		
		for (detailsEntity entity : entities) {
			orders.add(modelMapper.map(entity, pricesModel.class));
		}
		return orders;
	}

	@Override
	public long addOne(pricesModel newPrice) {
		
		detailsEntity entity = modelMapper.map(newPrice, detailsEntity.class);
		detailsEntity result = pricesRepository.save(entity);
		if (result == null) {
			return 0;
		} else {
			return result.getId();
		}
	}

	@Override
	public boolean deleteOne(long id) {
		pricesRepository.deleteById(id);
		return true;
	}

	@Override
	public pricesModel updateOne(long idToUpdate, pricesModel updatePrice) {
		detailsEntity entity = modelMapper.map(updatePrice, detailsEntity.class);
		detailsEntity result = pricesRepository.save(entity);
		pricesModel order = modelMapper.map(result, pricesModel.class);
		return order;
	}	
}