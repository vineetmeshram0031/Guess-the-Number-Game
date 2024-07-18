import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int numberofAttempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the guess the number game!");
            System.out.println("I am thinking of a number between " + lowerBound + " and " + upperBound + "...");

            while (!hasGuessedCorrectly) {
                System.out.println("Enter your guess:");
                int userGuess = s.nextInt();
                numberofAttempts++;
                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + "...");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number in " + numberofAttempts + " attempts");
                }
            }

            System.out.println("Do you want to play again? (Yes/No)");
            String userResponse = s.next().toLowerCase();
            if (!userResponse.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        s.close();
    }
}
