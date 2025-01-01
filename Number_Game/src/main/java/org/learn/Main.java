import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int roundsWon = 0;

        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            int maxAttempts = 10;
            int attempts = 0;
            int guess = 0;

            System.out.println("guess the number between 1 and 100.");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + " of " + maxAttempts + "): ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                }
            }
            if (guess != randomNumber) {
                System.out.println("Sorry! You've used all your attempts. The correct number was: " + randomNumber);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (response.equals("no")) {
                break;
            }
        }


        System.out.println("\nGame Over! You won " + roundsWon + " round(s).");

        scanner.close();
    }
}
