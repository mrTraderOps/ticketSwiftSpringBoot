package com.ticketReservation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.ticketReservation.services.priceBusinessService;
import com.ticketReservation.services.priceBusinessServiceInterface;

@Configuration
public class SpringConfig {
	
	@Bean(name="priceBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public priceBusinessServiceInterface getPriceBusiness() {
		return new priceBusinessService();
	}
}
