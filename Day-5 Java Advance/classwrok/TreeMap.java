package com.coforge.day5;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class TreeMap {

    public static void main(String[] args) {

        Map<Integer, String> map =
                new java.util.TreeMap<>(Collections.reverseOrder());

        map.put(10, "java");
        map.put(20, "python");
        map.put(30, "Angular");
        map.put(40, "React");

        System.out.println(map);

        map.put(10, "db");   // Update value

        map.remove(10);

        System.out.println(map);

        System.out.println(map.get(30));

        // Traverse using keySet()
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println(key + " => " + map.get(key));
        }

        System.out.println("---------------");

        // Traverse using entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}