package com.coforge.day6.java8features;

interface MyInterface {
	public void myMethod();
	public default void myMethod2() {
	
	System.out.println("Default Method");
	}
	public static void myMethod3() {
		
		System.out.println("Static Method");
		}
}

public class Java8InterfaceTest implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");
		
	}
	@Override
	public  void myMethod2() {
		
		System.out.println("Default Method");
	}
	/* @Override
    public  void myMethod3() {
		
		System.out.println("Static Method");
		} */
	

}
