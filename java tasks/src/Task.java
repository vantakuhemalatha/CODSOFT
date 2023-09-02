import java.util.*;
public class Task {
    public static void guessingNumberGame() {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            int K = 6;
            int roundsWon = 0;

            System.out.println("Welcome to the Guessing Number Game!");
            System.out.println("You have " + K + " trials per round.");
            

            while (true) {
                int number = random.nextInt(100) + 1;
                int i;
                System.out.println("A number is chosen between 1 to 100.");

                for (i = 0; i < K; i++) {
                    System.out.print("Guess the number: ");
                    int guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("Congratulations! You guessed the number.");
                        roundsWon++;
                        break;
                    } else if (number > guess && i != K - 1) {
                        System.out.println("Your guessing number is bigger than the original number.");
                    } else if (number < guess && i != K - 1) {
                        System.out.println("Your guessing number is smaller than the original number.");
                    }
                }

                if (i == K) {
                    System.out.println("You have exhausted " + K + " trials. The number was: " + number);
                }


                System.out.println("Rounds won: " + roundsWon);
                System.out.print("Do you want to play another round? (yes/no): ");
                String playAgain = sc.next().toLowerCase();

                if (!playAgain.equals("yes")) {
                    System.out.println("Thanks for playing!");
                    break;
                }
            }
        }
    }
    public static void main(String arg[]) throws Exception {
        guessingNumberGame();
    }
}