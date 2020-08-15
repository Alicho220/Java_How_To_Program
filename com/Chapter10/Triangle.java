package com.Chapter10;

public class Triangle extends TwoDimensionalShape {
	
	private double base;
	private double height;
	
	
	

	
	public double getBase() {
		return base;
	}





	public void setBase(double base) {
		this.base = base;
	}





	public double getHeight() {
		return height;
	}





	public void setHeight(double height) {
		this.height = height;
	}





	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return base * height;
		
		
	}

	public void getshape() {
		System.out.println("This is a Triangle");
	}

}
