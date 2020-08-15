package com.Chapter10;

public class Circle extends TwoDimensionalShape {
	
	private double PI;
	private double radius;
	
	
	
	public double getPI() {
		return PI;
	}



	public void setPI(double pI) {
		PI = pI;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public double getArea() {
		
		return Math.PI * radius * radius;
	}


	public void getshape() {
		System.out.println("This is a Circle");
	}

}
