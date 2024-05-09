package com.ticketReservation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.ticketReservation.data.PricesDataAccessInterface2;
import com.ticketReservation.data.DetailsDataServiceForRepository;
import com.ticketReservation.models.pricesModel;
import com.ticketReservation.services.DetailsBusinessService;
import com.ticketReservation.services.DetailsBusinessServiceInterface;
import com.ticketReservation.services.priceBusinessService;
import com.ticketReservation.services.priceBusinessServiceInterface;

@Configuration
public class SpringConfig {
	
	@Bean(name="priceBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public priceBusinessServiceInterface getPriceBusiness() {
		return new priceBusinessService();
	}
	
	@Autowired
	DataSource dataSource;
	
//	@Bean(name="pricesDAO")
//	@RequestScope
//	public PricesDataAccessInterface2 getDataService() {
//		return new pricesDataServiceForRepository(dataSource);
//	}
	
	@Bean(name="DetailsBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public DetailsBusinessServiceInterface getDetailsBusiness() {
		return new DetailsBusinessService();
	}
}
