package com.coforge.day6.java8features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Java8StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 23, 42, 15);
		
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);
		
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		
		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2). forEach(System.out::println);
		
		List<String> names = Arrays.asList("Bunny" , "Akash" , "Sunil");
		
		names.stream().filter(name -> name.contains("a")).forEach(System.out::println);
		
		//length of name
		names.stream().filter(name -> name.contains("a")).map(name -> name.length()).forEach(System.out::println);
		
		//To Display Date alone
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//To Display Date alone
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
	

	}

}
