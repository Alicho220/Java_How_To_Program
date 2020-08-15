package com.Chapter10;

public class Tetrahedron extends ThreeDimensionalShape {
	private double length;
	
	
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getVolume() {
		return Math.pow(length, 2);
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void getshape() {
		System.out.println("This is a Tetrahedron");
	}

	

}
