package com.coforge.day5;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<> ();
		
		Set<Integer> set = new TreeSet<> (Collections.reverseOrder()); //dmd
		
		
		set.add(new Integer(10)); //Boxing
		set.add(20); //Auto Boxing
		set.add(40);
		set.add(50);
		set.add(30);
		set.remove(20);
		System.out.println(set);
		
		
	
		//traverse with out index
		for(Integer i : set)
		    System.out.println((i));
		    
		// traverse using iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
