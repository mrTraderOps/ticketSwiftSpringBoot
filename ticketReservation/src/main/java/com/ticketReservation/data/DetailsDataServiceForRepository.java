package com.ticketReservation.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.models.detailsEntity;
import com.ticketReservation.models.eventdetailsModel;


public class DetailsDataServiceForRepository implements DetailsDataAccessInterface<eventdetailsModel> {

	@Autowired
	DetailsRepositoryInterface detailsRepository;
	
	private JdbcTemplate jdbcTemplate;             
	
	public DetailsDataServiceForRepository (DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate (dataSource);
	}
	
	ModelMapper modelMapper = new ModelMapper();

	
	@Override
	public List<eventdetailsModel> getDecAve() {
		
		Iterable<detailsEntity> detailEntity = detailsRepository.findByEventContainingIgnoreCase("decAve");
		
		List<eventdetailsModel> models = new ArrayList<eventdetailsModel>();
		
		for(detailsEntity item: detailEntity) {
			models.add(modelMapper.map(item, eventdetailsModel.class));
		}
		return models;
	}


	@Override
	public List<eventdetailsModel> getKeshi() {
		
		Iterable<detailsEntity> detailEntity = detailsRepository.findByEventContainingIgnoreCase("keshi");
		
		List<eventdetailsModel> models = new ArrayList<eventdetailsModel>();
		
		for(detailsEntity item: detailEntity) {
			models.add(modelMapper.map(item, eventdetailsModel.class));
		}
		return models;
	}


	@Override
	public List<eventdetailsModel> getDion() {
		Iterable<detailsEntity> detailEntity = detailsRepository.findByEventContainingIgnoreCase("Dion");
		
		List<eventdetailsModel> models = new ArrayList<eventdetailsModel>();
		
		for(detailsEntity item: detailEntity) {
			models.add(modelMapper.map(item, eventdetailsModel.class));
		}
		return models;
	}


	@Override
	public List<eventdetailsModel> getCircus() {
		
		Iterable<detailsEntity> detailEntity = detailsRepository.findByEventContainingIgnoreCase("Circus");
		
		List<eventdetailsModel> models = new ArrayList<eventdetailsModel>();
		
		for(detailsEntity item: detailEntity) {
			models.add(modelMapper.map(item, eventdetailsModel.class));
		}
		return models;
	}


	@Override
	public List<eventdetailsModel> getZack() {
		
		Iterable<detailsEntity> detailEntity = detailsRepository.findByEventContainingIgnoreCase("Circus");
		
		List<eventdetailsModel> models = new ArrayList<eventdetailsModel>();
		
		for(detailsEntity item: detailEntity) {
			models.add(modelMapper.map(item, eventdetailsModel.class));
		}
		return models;
	}


	@Override
	public List<eventdetailsModel> getAuFest() {
		
		Iterable<detailsEntity> detailEntity = detailsRepository.findByEventContainingIgnoreCase("AuFest");
		
		List<eventdetailsModel> models = new ArrayList<eventdetailsModel>();
		
		for(detailsEntity item: detailEntity) {
			models.add(modelMapper.map(item, eventdetailsModel.class));
		}
		return models;
	}


	@Override
	public long addOne(eventdetailsModel newDetails) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public eventdetailsModel updateOne(long idToUpdate, eventdetailsModel updateDetails) {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
//	public long addOne(eventdetailsModel newPrice) {
//		
//		pricesEntity entity = modelMapper.map(newPrice, pricesEntity.class);
//		pricesEntity result = detailsRepository.save(entity);
//		if (result == null) {
//			return 0;
//		} else {
//			return result.getId();
//		}
//	}
//
//	@Override
//	public boolean deleteOne(long id) {
//		detailsRepository.deleteById(id);
//		return true;
//	}
//
//	@Override
//	public eventdetailsModel updateOne(long idToUpdate, eventdetailsModel updatePrice) {
//		pricesEntity entity = modelMapper.map(updatePrice, pricesEntity.class);
//		pricesEntity result = detailsRepository.save(entity);
//		eventdetailsModel order = modelMapper.map(result, eventdetailsModel.class);
//		return order;
//	}	
}