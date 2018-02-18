package com.skc.cab.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.skc.common.exception.annotation.EnableMicroserviceException;
import com.skc.common.stream.annotation.EnableMicroserviceRabbitMQ;

@SpringBootApplication
@EnableMicroserviceException
@EnableMicroserviceRabbitMQ
@ComponentScan("com.skc.*")
public class CabBookingRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookingRequestApplication.class, args);
	}
}
