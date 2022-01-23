package com.ni3.customerserviceapi;

import com.ni3.customerserviceapi.service.CustomerBookingService;
import com.ni3.customerserviceapi.service.CustomerBookingServiceDBImpl;
import com.ni3.customerserviceapi.service.CustomerBookingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@EntityScan
@SpringBootApplication
public class CustomerServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApiApplication.class, args);
	}

	@Bean(name = "service")
	public CustomerBookingService getCustomerBookingService(){
		return new CustomerBookingServiceImpl();
	}

	@Bean(name = "dbService")
	public CustomerBookingService getCustomerBookingDBService(){
		return new CustomerBookingServiceDBImpl();
	}
}
