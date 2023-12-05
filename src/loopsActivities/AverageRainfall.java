package loopsActivities;
import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numYears = console.nextInt();
        int Months = 0;
        double Rainfall = 0;
        for (int i = 0; i < numYears; i++) {
            for (int j = 1; j <= 12; j++) {
                // Ask for inches of rainfall
                System.out.print("Enter the inches of rainfall for month " + j + " in year " + (i + 1) + ": ");
                double rainfall = console.nextDouble();
                Months++;
                Rainfall += rainfall;
            }
        }
        double averageRainfall = Rainfall / Months;
        System.out.println("Number of months: " + Months);
        System.out.println("Total inches of rainfall for the period of years: " + Rainfall);
        System.out.println("Average rainfall per month for the period: " + averageRainfall);

    }
}
