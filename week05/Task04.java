package week05;

public class Task04 {

	public static void main(String[] args) {

		/* create string array, and store the names of your class mates (10)
		 reverse each students names and print them in separate lines 

		Example:
		input:
		arr = {java, python, c#}

		output:
		avaJ
		nohtyp
		#c
	*/
		String[] names = { "Syed", "Payz", "Camiran" };
		for (int i = 0; i <= names.length - 1; i++) {
			String straight = names[i];
			String reversed = "";
			
			for (int j = straight.length() - 1; j >= 0; j--) {
				reversed += straight.charAt(j);
			}
			System.out.println(reversed);
		}

	}

}
