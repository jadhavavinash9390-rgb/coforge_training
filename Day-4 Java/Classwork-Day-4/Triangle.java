package com.coforge.day4;

public class Triangle extends Figure {
	public Triangle() {
		super(6L, 7L);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void area() {
		System.out.println("Area of the Triangle : " + (0.5*getBase()*getHeight()));
	}

}
