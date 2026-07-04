package com.coforge.day4.abstraction;

public class AreaCakculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Rectangle rectangle = new Rectangle();
		rectangle.area();
		
		Square square = new Square();
		square.area();
		
		Triangle triangle = new Triangle();
		triangle.area(); */
		
		//Dynamic Method Dispatch
	
		AreaPlan figure;   //only giving the reference to the interface
		figure = new Rectangle();
		figure.area();
		figure = new Square();
		figure.area();
		figure = new Triangle();
		figure.area();
	
		/*Rectangle rectangle = (Rectangle)new Figure(5); */
		//reverse is not possible
	}

}
