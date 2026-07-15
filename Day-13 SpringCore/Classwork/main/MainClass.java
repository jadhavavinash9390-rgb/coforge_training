package com.coforge.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;

public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println(employee1);

        Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println(employee2);

        context.close();
    }
}