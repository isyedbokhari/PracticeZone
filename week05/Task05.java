package week05;

public class Task05 {

	public static void main(String[] args) {
		
		
		String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"}; 
		double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}; 
		int[] itemIDs = {12345 , 12346, 12347, 12348, 12349, 12350};
		
		
		for (int i = 0 ; i <= items.length -1 ; i++) {
			if (items[i].equals("Gloves")) {
				System.out.println("The index of Gloves is: " + i);
			}
			if (items[i].equals("iPad")) {
				System.out.println("Yes, the list contains iPad!");
			} 
		}
		
		for (int a = 0 ; a <= items.length -1; a++) {
			System.out.printf("%-10s  $%.2f  %7d\n" , items[a] , prices[a] , itemIDs[a] );
			
		}
			
	}

}
