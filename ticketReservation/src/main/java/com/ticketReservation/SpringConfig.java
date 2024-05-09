package com.ticketReservation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.ticketReservation.data.DetailsDataAccessInterface;
import com.ticketReservation.data.DetailsDataServiceForRepository;
import com.ticketReservation.data.userDataServiceForRepository;
import com.ticketReservation.data.userDataAccessInterface;
import com.ticketReservation.services.DetailsBusinessService;
import com.ticketReservation.services.DetailsBusinessServiceInterface;
import com.ticketReservation.services.userBusinessService;
import com.ticketReservation.services.userBusinessServiceInterface;

@Configuration
public class SpringConfig {
		
	@Bean(name="DetailsBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public DetailsBusinessServiceInterface getDetailsBusiness() {
		return new DetailsBusinessService();
	}
	
	@Autowired
	DataSource dataSource;
	
	@Bean(name="detailsDAO")
	@RequestScope
	public DetailsDataAccessInterface getDataService() {
		return new DetailsDataServiceForRepository(dataSource);
	}
	
	@Bean(name="userBusinessService")
	@RequestScope
	public userBusinessServiceInterface getuserBusiness() {
		return new userBusinessService();
	}
	
	
	@Bean(name="userDAO")
	@RequestScope
	public userDataAccessInterface getuserService() {
		return new userDataServiceForRepository(dataSource);
	}
	
}
