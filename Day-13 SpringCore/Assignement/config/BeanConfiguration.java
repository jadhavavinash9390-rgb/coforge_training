package com.coforge.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {
	@Bean(name="student")
	public Student getstudent() {
		Student student = new Student();
		student.setsId(201);
		student.setsName("Akash");
		student.setAddress(getaddress());
		student.setSubjects(Arrays.asList("EH","MFCS","WT","ICS"));
		Set<String> set = new HashSet(Arrays.asList("Node","Angular","Springboot","BLAHBLAH"));
		student.setSkills(set);
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("EH", 97);
		map.put("MFCS", 90);
		map.put("WT", 76);
		map.put("ICS", 55);
		student.setMarks(map);
		return student;
	}
	
	
	
	@Bean(name = "address")
	public Address getaddress() {
		Address address = new Address();
		address.setCity("Adb");
		address.setState("Ts");
		return address;
	}
}
