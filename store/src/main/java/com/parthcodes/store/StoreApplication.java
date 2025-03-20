package com.parthcodes.store;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StoreApplication.class, args);
		// var orderService = new OrderService();
		// orderService.setPaymentService(new StripePaymentService()); // dependancy
		// injection using setter
		// var orderService = new OrderService(new StripePaymentService()); // dependancy injection constructor (recommended)
		
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args); //IOC -> define beans using annotations
		var orderService = context.getBean(OrderService.class); 
		orderService.placeOrder();
	}

}
