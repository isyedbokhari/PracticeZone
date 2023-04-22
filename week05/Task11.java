package week05;

public class Task11 {

	public static void main(String[] args) {
		
/*
 * Write a program that can return the number of 
 * appearances of “java” and “python” anywhere in the
   sentence.
   (similar to the task in repl.it, 
   but this time you MUST use arrays and for each loop)
   */
		
		
		String sentence[] = {"I love JAVA even more than Python!" ,
				"JAVA has a better performance edge over Python" , 
				"JAVA is simply the BEST!"};
		
		int javaCount = 0;
		int pythonCount = 0;
		
		for (String a : sentence) {
			
			if (a.toLowerCase().contains("java")) {
				javaCount++;
		}	if (a.toLowerCase().contains("python")) {
			pythonCount++;
		}
		
	}		System.out.println("JAVA appeared " + javaCount + " time(s) and Python appeared " + pythonCount + " time(s).");

	}
}
