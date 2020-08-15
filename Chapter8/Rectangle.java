package Chapter8;

public class Rectangle {

	private float length = 1;
	private float width = 1;
	
	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if(length>0.0 && length <20)
			this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if(width>0.0 && width <20)
			this.width = width;
		this.width = width;
	}

	public float calculateParimeter() {
		float parimeter = length + width + length + width;
		return parimeter;
	}
	
	public float calculateArea() {
		float area = length * width;
		return area;
	}
}
