package week04;

import java.util.Random;
import java.util.Scanner;

public class LoopTask_AdvancedGuessingGame {

	public static void main(String[] args) {

		String playAgain = "y";
		while (playAgain.equalsIgnoreCase("y")) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi! What's your name?");
		String name = scan.nextLine();
		System.out.println(name + ", guess a number between 1 - 100...");
		Random random = new Random();
		int randomNum = random.nextInt(100);
		int highScore = Integer.MAX_VALUE;
		boolean isFound = false;
		
		for (int j = 1; j <= 3; j++) {
			int num = scan.nextInt();
			scan.nextLine();

			int numOfTries = j;
			if (num == randomNum) {
				isFound = true;
				System.out.println(name + ", CONGRATULATIONS" + " your have won!");
				System.out.println("The secret number was: " + randomNum);
				if (numOfTries < highScore) {
					highScore = numOfTries;
					System.out.println("The highest score is: " + highScore);
				}
				break;
			} else if (num < randomNum) {
				System.out.println(name + ", " + "your number is smaller!");
				System.out.println("Guess between " + (randomNum - 10) + " and " + (10 + randomNum));
			} else if (num > randomNum && num < 100) {
				System.out.println(name + ", " + "your number is bigger!");
				System.out.println("Guess between " + (randomNum - 10) + " and " + (10 + randomNum));
			} else if (num >= 100) {
				System.out.println(name + ", " + "its an invalid entry, number must be between 1 - 100...");
				System.out.println("Guess between " + (randomNum - 10) + " and " + (10 + randomNum));
			}
			
			System.out.println("Number of tries: " + numOfTries);

		}

		if (!isFound) {
			System.out.println("Game Over!!!");
			System.out.println("The secret number was: " + randomNum);
		}
		
		System.out.println("Do you want to play again (y/n)?");
		playAgain = scan.nextLine();

		scan.close();
		}	

	}		
}
