import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;
        do {
            int randomNumber = rand.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 10;
            System.out.println("Welcome to Guessing Game (Guess the number between 1 and 100). You have " + attempts + " attempts.");
            while (attempts > 0 && userGuess != randomNumber) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                attempts--;
                if (userGuess > randomNumber) {
                    System.out.println("Too high! Attempts left: " + attempts);
                } 
                else if (userGuess < randomNumber) {
                    System.out.println("Too low! Attempts left: " + attempts);
                } 
                else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    break;
                }
                if (attempts == 0) {
                    System.out.println("You've run out of attempts. The correct number was: " + randomNumber);
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));
        sc.close();
    }
}

