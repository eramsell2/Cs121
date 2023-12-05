package weekFifteen.dateFormatActivity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your daily calorie allowance: ");
        int dailyCalories = scanner.nextInt();

        System.out.println("Enter the diet start date (mm/dd/yyyy): ");
        String startDateString = scanner.next();
        LocalDate startDate = LocalDate.parse(startDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        System.out.println("Enter the diet end date (mm/dd/yyyy): ");
        String endDateString = scanner.next();
        LocalDate endDate = LocalDate.parse(endDateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        totalCalories totalCalories = new totalCalories(dailyCalories, startDate, endDate);
        int totalConsumedCalories = totalCalories.getTotalConsumedCalories();

        System.out.println("Total calories consumed during the diet: " + totalConsumedCalories);
    }
    }

