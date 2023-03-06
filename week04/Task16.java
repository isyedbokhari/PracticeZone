package week04;

public class Task16 {

	public static void main(String[] args) {
		
//		Task16
//		Write a program to extract distinct character from a string input: abcabcabcabc output:abc
		
		
		
		String input = "abcabcabc";
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (result.indexOf(c) == -1) {
				result = result + input.charAt(i);
			}
		}
		System.out.println(result);
		
		
		
		System.out.println("==========");
		
		String inp = "abcabcasdfasdfa";
//	    String output = "";
	    StringBuilder sb = new StringBuilder();

	    // check the 'output' that, is it already contain the character
	    for (int i = 0; i < inp.length(); i++) {
	      char eachChar = inp.charAt(i); // each character of 'input' str
	      
	      // using StringBuilder
	      if (sb.indexOf(eachChar+"") == -1)
	        sb.append(eachChar);
	      
	      // using the String + contains()
	      // if (!output.contains(eachChar + ""))
//	        output += eachChar+"";
	    }

	    System.out.println(sb);
		
	}

}
