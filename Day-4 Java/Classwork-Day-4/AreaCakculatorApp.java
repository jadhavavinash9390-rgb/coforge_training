package com.coforge.day4;

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
	
		Figure figure;
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
