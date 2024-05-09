package com.ticketReservation.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ticketReservation.models.userEntity;
import com.ticketReservation.models.userModel;


public class userDataServiceForRepository implements userDataAccessInterface<userModel>{

	@Autowired
	userRepositoryInterface userRepository;
	
	private JdbcTemplate jdbcTemplate;             
	
	public userDataServiceForRepository (DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate (dataSource);
	}
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public long addOne(userModel newDetails) {
		userEntity entity = modelMapper.map(newDetails, userEntity.class);
		userEntity result = userRepository.save(entity);
		if (result == null) {
			return 0;
		} else {
			return result.getId();
		}
	}

	@Override
	public List<userModel> getUser(String searchUsername, String searchPassword) {
		
		Iterable<userEntity> usersEntity = userRepository.findByUsernameContainingIgnoreCase(searchUsername);
		
		List<userModel> models = new ArrayList<userModel>();
		
		for(userEntity item: usersEntity) {
	        if (item.getPassword().equals(searchPassword)) {
	            models.add(modelMapper.map(item, userModel.class));
	        }  
		}
		return models;
	}

	@Override
	public List<userModel> searchName(String searchTerm) {
		List<userModel> results = jdbcTemplate.query("SELECT * FROM users WHERE username = ?", new userMapper(), searchTerm);
		return results;
	}

	@Override
	public List<userModel> getName(String searchUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOneByUsername(String username, String oldPass, String newPass) {
		
		int result = jdbcTemplate.update("UPDATE users SET password = ? WHERE username = ? AND password = ?",
				newPass,
				username,
				oldPass);
		if (result > 0 ) {
			return true;
		} else {
			return false;
		}
	}
}
	
