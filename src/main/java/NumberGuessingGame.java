import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    private static final int maxAttempts = 4;
    private static int numberOfRoundsWon = 0;
    private  static int score=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        System.out.println("BEFORE START THE GAME ENTER YOUR NAME!!");
        String userName= scanner.next();
        System.out.println("WELCOME!! "+userName);
        do {
            // Generate a random number between 1 and 100
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println(userName+"GUESS THE NUMBER BETWEEN 1 TO 100 ?");

            while (attempts < maxAttempts) {
                System.out.print("ENTER THE GUESS: ");
                int userGuessNumber = scanner.nextInt();
                attempts++;

                if (userGuessNumber < 1 || userGuessNumber > 100) {
                    System.out.println("GUESS IS OUT OF THE RANGE. PLEASE ENTER THE NUMBER BETWEEN 1 AND 100");
                } else if (userGuessNumber == numberToGuess) {
                    System.out.println("CONGRATULATIONS!!!"+userName+" YOU ENTER THE CORRECT NUMBER");
                    score=score+10;
                    hasGuessedCorrectly = true;
                    numberOfRoundsWon++;
                    break;
                } else if (userGuessNumber < numberToGuess) {
                    System.out.println("NUMBER IS TOO LOW!!");
                } else {
                    System.out.println("NUMBER IS TOO HIGH!!");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("ALL THE ATTEMPTS ARE USED CORRECT NUMBER IS: " + numberToGuess);
            }

            //WANT TO PLAY AGAIN
            System.out.print("DO YOU WANT TO PLAY AGAIN? (yes/no): ");
            playAgain = scanner.next().toLowerCase();

        } while (playAgain.equals("yes"));

        // DISPLAY THE SCORE
        System.out.println("GAME OVER!!!");
        System.out.println("YOUR SCORE:"+score+" AND NUMBER OF ROUND WON:" + numberOfRoundsWon + " round(s).");
        scanner.close();
    }

}
