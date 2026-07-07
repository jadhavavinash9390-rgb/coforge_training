package com.coforge.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "java");
		map.put(20, "python");
		map.put(30, "Angular");
		map.put(40, "React");
		
		System.out.println(map);
		
		map.put(10, "db");
		
		map.remove(10);
		System.out.println(map);
		
		System.out.println(map.get(30));
		
		//Traverse the Map collection
		Set<Integer> key = map.keySet() ;
		for(Integer Key : key)
			System.out.println(key + " => " + map.get(key));
		
		//Traverse
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries)
			System.out.println(entry.getKey() + " => " + entry.getValue());
		
	}

}
