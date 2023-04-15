package week07;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape circle = new CircleShape(2);
		circle.getArea();
		
		Shape rectangle = new RectangleShape(2,3);
		rectangle.getArea();
		
		Shape triangle = new TriangleShape(2,6);
		triangle.getArea();
		
		System.out.println("=========");
		
		Shape shapes[] = new Shape[3];
		shapes[0] = new CircleShape(2);
		shapes[1] = new RectangleShape(2, 4);
		shapes[2] = new TriangleShape(2, 6);
		for (Shape shape : shapes) {
			shape.getArea();
		}
	}

}
