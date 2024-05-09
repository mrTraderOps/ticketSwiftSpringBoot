package com.ticketReservation.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.ticketReservation.models.detailsEntity;

public interface PricesRepositoryInterface extends CrudRepository <detailsEntity, Long> {
	
	List<detailsEntity> findBySeatLevelContainingIgnoreCase(String searchTerm);
	
}
