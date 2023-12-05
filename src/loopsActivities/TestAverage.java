package loopsActivities;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many students are there?");
        int students = console.nextInt();
        System.out.println("How many test scores are there per student?");
        int scoresPer = console.nextInt();
        for (int i = 0; i < students; i++) {
            double[] testScores = new double[scoresPer];



            for (int j = 0; j < scoresPer; j++) {
                System.out.println("Enter test score: " + (j + 1) + " for student " + (i + 1) + ": ");
                testScores[j] = console.nextDouble();


            }
            //double averageTestScore = calcAverage(testScores);
            //System.out.println("The average test score for student " + (i + 1) + " is " + averageTestScore);




        }



    }
}
