package WeekTwo;

import java.util.Scanner;

public class IntegerDiv {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstname = keyboard.nextLine();
        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println(age);

        System.out.println(firstname);
        System.out.println("What is your gpa?");
        int numOne = 1;
        int numTwo = 4;
        double results = (double)numOne/numTwo;
        System.out.print(results);

        double result = (double)(numOne/numTwo);
        System.out.print(result);
        String name = (" Ethan");
        System.out.print(name);

    }
}
