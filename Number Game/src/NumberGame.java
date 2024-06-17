import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        boolean playAgain = true;
	        int rounds=0,won=0;

	        while (playAgain) {
	            int min = 1;
	            int max = 100;
	            int maxAttempts = 10;
	            int targetNumber = random.nextInt(max - min + 1) + min;
	            int attempts = 0;
	            boolean guessedCorrectly = false;
	            System.out.println("-----------------------------");
	            System.out.println("\tNUMBER GAME");
	            System.out.println("  GUESS THE NUMBER(1-100)");
	            System.out.println("-----------------------------");
                rounds++;
	            while (attempts < maxAttempts && !guessedCorrectly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;
	                if (userGuess < targetNumber) {
	                    System.out.println("Too low!");
	                } else if (userGuess > targetNumber) {
	                    System.out.println("Too high!");
	                } else {
	                	System.out.println("--------");
	                    System.out.println("Correct!");
	                    System.out.println("--------");
	                    guessedCorrectly = true;
	                    won++;
	                }
	            }

	            if (!guessedCorrectly) {
	            	System.out.println("----------------------------------------------------------");
	                System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
	                System.out.println("----------------------------------------------------------");
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String response = scanner.next();
	            playAgain = response.equalsIgnoreCase("yes");
	        }
	        System.out.println("\n-------------------------------------");
	        System.out.println("You won "+won+" round's out of "+rounds+" round's ");
	        System.out.println("-------------------------------------");
	        System.out.println("Thank you for playing!");
	        scanner.close();
		
	}

}
