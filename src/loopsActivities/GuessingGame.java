package loopsActivities;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int guesses = 0;
        int correctNum = 35;
        while(true){
            System.out.println("Guess a number between 1-100 or enter q to quit");
            String answer = console.nextLine();
            if(answer.equals("q")){
                System.out.println("You quit, the number was 35");
                break;
            }else{
                System.out.println("Guess a number between 1-100 or enter q to quit");
                answer = console.nextLine();
                int number = Integer.parseInt(answer);
                if(number == correctNum){
                    System.out.println("You guessed correctly! It took you " + guesses + " guesses!");
                }else if(number < correctNum){
                    System.out.println("Too low, guess again!");
                }else{
                    System.out.println("Too high, guess again!");
                }
            }int number = 0;
            guesses++;
        }

    }
}
