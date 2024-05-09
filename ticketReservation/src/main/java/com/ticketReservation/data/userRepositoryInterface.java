package com.ticketReservation.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ticketReservation.models.userEntity;

public interface userRepositoryInterface extends CrudRepository <userEntity, Long> {
	
	List<userEntity> findByUsernameContainingIgnoreCase(String searchTerm);
	
}
