package week07;

public class CarObj {

	public static void main(String[] args) {
		
		Car porsche = new Car("Porsche","911 Turbo", 2023);
		
		System.out.println("Make: " + porsche.getMake());
		System.out.println("Model: " + porsche.getModel());
		System.out.println("Year: " + porsche.getYear());
		porsche.getInfo();
	}

}
