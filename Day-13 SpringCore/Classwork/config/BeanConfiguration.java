package com.coforge.config;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Customer;
import com.coforge.model.DeliveryAddress;

@Configuration
public class BeanConfiguration {
	
	@Bean(name = "customer1")
	public Customer getCustomer() {
	    Customer customer = new Customer();
	    customer.setCustomerId(101);
	    customer.setCustomerName("bunny");
	    customer.setEmails(Arrays.asList("bunny@gmail.com", "bunnay1@gmail.com"));
	    customer.setDeliveryAdress(Arrays.asList(getDeliveryAddress1()));

	    return customer;
	}
	
	@Bean(name = "deliveryAddress1")
	public DeliveryAddress getDeliveryAddress1() {
		DeliveryAddress deliveryAddress1 = new DeliveryAddress();
		deliveryAddress1.setCity("City-1");
		deliveryAddress1.setState("State-1");
		return deliveryAddress1;
	}
	
	@Bean(name = "deliveryAddress2")
	public DeliveryAddress getDeliveryAddress2() {
		DeliveryAddress deliveryAddress2 = new DeliveryAddress();
		deliveryAddress2.setCity("City-1");
		deliveryAddress2.setState("State-1");
		return deliveryAddress2;
	}

}
