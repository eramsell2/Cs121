package WeekThree;
import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Choose one of these four houses to be in: Ravenclaw, Hufflepuff, Gryffindor, or Slytherin.");
        String house = console.nextLine();
        switch (house) {
            case "Ravenclaw":
                System.out.println("Wisdom and Intelligence.");
                break;
            case "Hufflepuff":
                System.out.println("Dedication and Patience.");
                break;
            case "Gryffindor":
                System.out.println("Courage and Bravery.");
                break;
            case "Slytherin":
                System.out.println("Ambition and Leadership.");
                break;


        }


    }
}

