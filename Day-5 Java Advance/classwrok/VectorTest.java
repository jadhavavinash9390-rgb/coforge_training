package com.coforge.day5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<> ();
		
		Vector<Integer> list = new Vector<> (); //dmd
		
		
		list.add(new Integer(10)); //Boxing
		list.add(20); //Auto Boxing
		list.add(40);
		list.add(50);
		list.add(30);
		list.add(20);
		System.out.println(list);
		System.out.println(list.get(3)); //50
		
		//remove the element
		list.remove(2);
		System.out.println(list);
		//update
		list.set(0, 70);
		System.out.println(list);
		//traverse
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
		//traverse with out index
		for(Integer i : list)
		    System.out.println((i));
		    
		// traverse using iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	    //
		
		Enumeration <Integer> en = list.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		}

	}

}
