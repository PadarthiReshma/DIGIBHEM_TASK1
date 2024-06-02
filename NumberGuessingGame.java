import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int lowerBound = 1;
            int upperBound = 100;
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int maxAttempts = 5;
            boolean hasWon = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                int playerGuess = scanner.nextInt();

                if (playerGuess < randomNumber) {
                    System.out.println("Too low!");
                } else if (playerGuess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    hasWon = true;
                    break;
                }
            }

            if (!hasWon) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. You lost the game. The number was " + randomNumber + ".");
            }

            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing the Number Guessing Game! Goodbye!");
        scanner.close();
    }
}
