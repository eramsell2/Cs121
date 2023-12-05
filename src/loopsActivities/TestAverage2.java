package loopsActivities;
import java.util.Scanner;
public class TestAverage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int students = scanner.nextInt();
        System.out.print("How many scores per student? ");
        int scoresPer = scanner.nextInt();

        for (int i = 0; i < students; i++) {
            // Ask for each test score
            double[] testScores = new double[scoresPer];
            for (int j = 0; j < scoresPer; j++) {
                System.out.print("Enter score " + (j + 1) + " for student " + (i + 1) + ": ");
                testScores[j] = scanner.nextDouble();
            }

            double averageTestScore = calculateAverageTestScore(testScores);
            System.out.println("The average test score for student " + (i + 1) + " is " + averageTestScore);
        }
    }

    private static double calculateAverageTestScore(double[] testScores) {
        double sum = 0;
        for (double testScore : testScores) {
            sum += testScore;
        }
        return sum / testScores.length;
    }
}
