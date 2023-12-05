package loopsActivities;
import java.util.Random;
import java.util.Scanner;
public class ESPGame {
    private static final String[] COLORS = {"red", "green", "blue", "orange", "yellow"};
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctGuesses = 0;
        for (int i = 0; i < 10; i++) {
            int randomColorIndex = random.nextInt(COLORS.length);
            String randomColor = COLORS[randomColorIndex];

            System.out.println("What color am I thinking of? Red, green, orange, blue, or yellow?");
            String userGuess = scanner.nextLine();

            if (userGuess.equals(randomColor)) {
                System.out.println("Correct!");
                correctGuesses++;
            } else {
                System.out.println("Incorrect. The correct color was " + randomColor);
            }
        }

        System.out.println("You guessed correctly" + correctGuesses + " times.");




    }
}
