package weekFive;
import java.util.Scanner;
public class Budget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your budgeted amount for the month:");
        double budget = scanner.nextDouble();
        double totalExpenses = 0;
        while (true) {
            System.out.println("Enter an expense, or press enter to finish:");
            String expense = scanner.nextLine();
            if (expense.isEmpty()) {
                break;
            }

            double amount = Double.parseDouble(expense);
            totalExpenses += amount;
        }

        System.out.println("Budget: $" + budget);
        System.out.println("Total expenses: $" + totalExpenses);
        double difference = totalExpenses - budget;
        if (difference > 0) {
            System.out.println("You are over budget by $" + difference);
        } else if (difference < 0) {
            System.out.println("You are under budget by $" + Math.abs(difference));
        } else {
            System.out.println("You are exactly on budget!");
        }
    }

}