import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    // Generate a random number between 1 and 100
    int randomNumber = (int) (Math.random() * 100) + 1;

    // Set the number of guesses the user has
    int guessesRemaining = 5;

    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Start the guessing loop
    while (guessesRemaining > 0) {
      System.out.print("Enter your guess: ");
      int userGuess = scanner.nextInt();

      if (userGuess == randomNumber) {
        System.out.println("Congratulations! You guessed the correct number!");
        break;
      } else if (userGuess < randomNumber) {
        System.out.println("Your guess is too low. Try again.");
      } else {
        System.out.println("Your guess is too high. Try again.");
      }

      guessesRemaining--;
    }

    if (guessesRemaining == 0) {
      System.out.println("Sorry, you ran out of guesses. The correct number was: " + randomNumber);
    }
  }
}

