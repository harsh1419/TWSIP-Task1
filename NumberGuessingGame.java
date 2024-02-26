//Number Gaming Game
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int play;

    do {
      System.out.println("************************************");
      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("************************************");
      int randomNumber = random.nextInt(11);

      int Attempts = 0;

      while (true) {
        System.out.print("Enter any number between(0-10): ");
        int userGuess = sc.nextInt();
        Attempts++;

        if (userGuess == randomNumber) {
          System.out.println(
            "Congratulations! You guessed the correct number."
          );
          System.out.println("Number of total attempts: " + Attempts);
          break; // Exit the loop if the guess is correct i
        } else if (userGuess < randomNumber) {
          System.out.println("Your guess is too low. Try again.");
        } else {
          System.out.println("Your guess is too high. Try again.");
        }
      }

      // Ask the player if they want to play again
      System.out.print("Enter 1 to play again or any other key to exit: ");
      System.out.println("");
      play = sc.nextInt();
    } while (play == 1);

    System.out.println("Thank you for playing! Goodbye.\n");
  }
}
