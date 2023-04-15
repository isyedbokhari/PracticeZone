package week07;

public class CircleShape implements Shape{
	
	private int radius;
	
	@Override
	public void getArea() {
		System.out.println("Circle Area: " +  Math.PI * radius * radius);
		
		
	}
	
	public CircleShape(int radius) {
		this.radius = radius;
	}
	
	
}
