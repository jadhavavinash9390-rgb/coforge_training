package com.coforge.day4;

public class Rectangle extends Figure {
	public Rectangle() {
		super(10, 20);
		
	}
	@Override
	public void area() {
		System.out.println("Area of the Rectangle : " + (getLength()*getBreadth()));
	}

}
