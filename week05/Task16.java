package week05;

public class Task16 {
		/*Given the Array:

String[][]items={
   {"Apple","Banana","Grape","Avocado"},
   {"Paper Towels","Toilet Papers","Tissues","Diapers"},
   {"Coke","Fanta","Arizona Tea","Pepsi","Water"}
   };


   - print the following output: (add \t between two words)

Apple           Banana          Grape           Avocado
Paper Towels    Toilet Papers   Tissues         Diapers
Coke            Fanta           Arizona Tea     Pepsi           Water


   - print the following output: (add \t between two words)

Avocado         Grape           Banana          Apple
Diapers         Tissues         Toilet Papers   Paper Towels
Water           Pepsi           Arizona Tea     Fanta           Coke


- print the following output: (add \t between two words)

Coke            Fanta           Arizona Tea     Pepsi           Water
Paper Towels    Toilet Papers   Tissues         Diapers
Apple           Banana          Grape           Avocado
*/
	public static void main(String[] args) {
		
		String[][]items={
				   {"Apple","Banana","Grape","Avocado"},
				   {"Paper Towels","Toilet Papers","Tissues","Diapers"},
				   {"Coke","Fanta","Arizona Tea","Pepsi","Water"}
				   };
		
		
		for (int i = 0; i <= items.length -1 ; i++) {
			for (int j = 0; j <= items[i].length -1; j++) {
				System.out.print(items[i][j] + "\t");
			}	System.out.println();
		} 
		
		
		
		
	}

}
