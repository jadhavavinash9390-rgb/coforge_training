package com.coforge.day4.exceptionhandling;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
	//	int a = 10/0;  //java.lang.ArithmeticException
	//	int b= Integer.parseInt("abc");
		int[] ar = new int[-4];
		}catch(ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Error : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Error"+e.getMessage());
		}finally {
			System.out.println("Final Block");
		}
	
		System.out.println("After Exception");

	}

}
