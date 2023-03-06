package week05;

public class Task21 {

	public static void main(String[] args) {
		
		String names[] = {"Syed", "Payz", "Abdusamat", 
				"Hammad", "Hakim", "Abdullah", 
				"Ali", "Muatter", "Bea", "Milad"};
		StringBuilder sb = new StringBuilder();
		for (String a : names) {
				sb.append (new StringBuilder(a).reverse().toString());
				sb.append("\n");
		}
		
		String reverse = sb.toString().trim();
		System.out.println(reverse);
		
		
		
		
	}

}
