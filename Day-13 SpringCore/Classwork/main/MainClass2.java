package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.coforge.config.BeanConfiguration;
import com.coforge.model.Customer;
import com.coforge.model.Employee;

public class MainClass2 {

    public static void main(String[] args) {
    

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer);

        
      
    }
}