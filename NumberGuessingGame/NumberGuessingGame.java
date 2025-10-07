import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lower = 1;
        int upper = 100;
        int maxAttempts = 7;
        int attempts = 0;

        // Generate random number between lower and upper
        int numberToGuess = lower + (int)(Math.random() * (upper - lower + 1));

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lower + " and " + upper + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it!");

        boolean guessed = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
                guessed = true;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too small! Try a higher number.");
            } else {
                System.out.println("Too big! Try a lower number.");
            }
        }

        if (!guessed) {
            System.out.println("Sorry, you have used all your attempts. The correct number was: " + numberToGuess);
        }

        // Show the score (number of attempts taken or used)
        System.out.println("Your final score (attempts used): " + attempts);

        sc.close();
    }
}
