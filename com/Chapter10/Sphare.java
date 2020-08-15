package com.Chapter10;

public class Sphare extends ThreeDimensionalShape {
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
		
		return 4 * Math.PI * (radius *radius);
	}

	@Override
	public double getVolume() {
		
		return 4/3 * Math.PI * (radius * radius *radius);
	}
	
	public void getshape() {
		System.out.println("This is a Sphare");
	}


}
