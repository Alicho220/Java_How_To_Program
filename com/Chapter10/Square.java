package com.Chapter10;

public class Square extends TwoDimensionalShape {
	
	private double length;
	
	
	
	
	public double getLength() {
		return length;
	}




	public void setLength(double length) {
		this.length = length;
	}




	@Override
	public double getArea() {
	
		return length*length;
	}
	
	public void getshape() {
		System.out.println("This is a square");
	}


}
