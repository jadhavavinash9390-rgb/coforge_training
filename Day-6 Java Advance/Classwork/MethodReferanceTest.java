package com.coforge.day6.java8features;
@FunctionalInterface
interface MyReferance {
	void showMessage();
}

public class MethodReferanceTest {
	
	void myInstanceMethod() {
		System.out.println("Example for Intance Method Referance");
	}

	static void myStaticMethod() {
		System.out.println("Example for Static Method Referance");

	}
	MethodReferanceTest() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		MethodReferanceTest obj = new MethodReferanceTest();
		MyReferance referance = obj::myInstanceMethod;
		referance.showMessage();
		
		
		referance = MethodReferanceTest::new;
		referance.showMessage();
	}

}
