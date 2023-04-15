package week07;

public class RectangleShape implements Shape {
	private int length;
	private int width;
	
	@Override
	public void getArea() {
		System.out.println("Rectangle Area: " + length * width);
	}
	
	public RectangleShape(int length, int width) {
		this.length = length;
		this.width = width;
	}
}
