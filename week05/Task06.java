package week05;

public class Task06 {

	public static void main(String[] args) {
		
		
//
//		  - write a program that can store the grades of the students in the array named grades
//		  - print the grade report of each student in separate lines. 
//
//		Example:
//		Anna's score is 90, and grade is A
		
		
		String [] names = {"Anna", "Nancy", "Sarah"}; 
		int [] scores = {90, 75, 80}; 
		char [] grades = new char[names.length];
		
		grades[0] = 'A';
		grades[1] = 'C';
		grades[2] = 'B';
		
		for (int i = 0 ; i <= names.length -1 ; i++) {
			System.out.println(names[i] + "'s score is " + scores[i] + ", and letter grade is " + grades[i]);
		}
		
	}

}
