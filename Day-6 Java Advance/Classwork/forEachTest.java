package com.coforge.day6.java8features;

import java.util.Arrays;
import java.util.List;

public class forEachTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 21, 30, 40);

        // Print all elements
        list.forEach(n -> System.out.println(n));

        System.out.println("----------------");

        // Print even numbers
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

        System.out.println("------------------");
        
        list.forEach(System.out::println);
        
    }
}