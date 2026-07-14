package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Course;
import com.coforge.model.Student;


public class main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Course c1 = new Course(101, "Java");
        Course c2 = new Course(102, "Spring Boot");
        Course c3 = new Course(103, "Hibernate");
        Course c4 = new Course(104, "Angular");

        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Priya");
        Student s3 = new Student(3, "David");

        s1.getCourses().add(c1);
        s1.getCourses().add(c2);

        s2.getCourses().add(c1);
        s2.getCourses().add(c3);

        s3.getCourses().add(c1);
        s3.getCourses().add(c2);
        s3.getCourses().add(c4);

        session.save(s1);
        session.save(s2);
        session.save(s3);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Many-to-Many Mapping Successful");
    }
}