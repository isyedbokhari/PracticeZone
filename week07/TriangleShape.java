package week07;

public class TriangleShape implements Shape {
	private int base;
	private int height;
	
	@Override
	public void getArea() {
		System.out.println("Triangle Area: " + 0.5 * height * base);
	}
	
	public TriangleShape(int base, int height) {
		this.base = base;
		this.height = height;
	}

}
