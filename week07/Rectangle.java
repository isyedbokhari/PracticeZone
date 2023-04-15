package week07;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getlength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		int area = length * width;
		return area;
	}
}
