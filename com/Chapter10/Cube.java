package com.Chapter10;

public class Cube extends ThreeDimensionalShape {
	private double length;
	
	
	


	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getVolume() {
		double volume = length * length * length;
		return volume;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 6 * (length * length);
	}
	public void getshape() {
		System.out.println("This is a Cube");
	}


}
