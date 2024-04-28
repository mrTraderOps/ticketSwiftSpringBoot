package com.ticketReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ticketReservation")
public class TicketReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketReservationApplication.class, args);
	}
}
