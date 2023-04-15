package week06;

public class Task01 {

	public static boolean isValidPassword(String password) {
		
		boolean isValid = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		boolean hasSpecialCharacter = false;
		
		if (password.length() >= 8 && !password.contains(" ")) {
			
			for (int i = 0; i < password.length(); i++) {
				
				
				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
					hasUpperCase = true;
				}
				
				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
					hasLowerCase = true;
				}
				
				if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
					hasDigit = true;
				}
				
				if (!Character.isLetterOrDigit(i)) {
					hasSpecialCharacter = true;
				}
				
			}
			
			if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter) {
				isValid = true;
			} else {
				System.out.println("Your password is invalid!");
			}
					}			
		return isValid;

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		/* Write a program that can verify if a password is a strong password.
   Characteristics of strong passwords are: 
   1.1 Password must be at least have 8
   characters long, and should not contain space 
   1.2 PassWord should at least
   contain one upper case letter 
   1.3 PassWord should at least contain one lower
   case letter 
   1.4 Password should at least contain one special characters 
   1.5 Password should at least contain a digit
		 */
		
		String password = "@sjD7dsfsdnfdn";
		System.out.println(isValidPassword(password));
		
		
		
	}

}
