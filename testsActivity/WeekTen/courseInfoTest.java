package WeekTen;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class courseInfoTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.println("Enter a name or q to quit");
            String name  = console.nextLine();
            if(name.toLowerCase().equals("q")){
                break;
            }
            addName(name);
            System.out.println("Enter GPA");
            double gpa2 = Double.parseDouble(console.nextLine());
            addGPA(gpa2);
            System.out.println("Enter letter grade");
            char letterGrade = console.next().charAt(0);
            addLetterGrade(letterGrade);
            System.out.println("Enter score");
            int score = Integer.parseInt(console.nextLine());
            addScore(score);

        }
    }

    @Test
    void displayStudent() {
    }

    @Test
    static void addName(String name) {
    }

    @Test
    static void addScore(int score) {
    }

    @Test
    static void addGPA(double gpa2) {
    }

    @Test
    static void addLetterGrade(char letterGrade) {
    }
}