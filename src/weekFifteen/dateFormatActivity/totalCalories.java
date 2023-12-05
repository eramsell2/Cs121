package weekFifteen.dateFormatActivity;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class totalCalories {
    private final int dailyCalories;
    private final LocalDate startDate;
    private final LocalDate endDate;


    public totalCalories(int dailyCalories, LocalDate startDate, LocalDate endDate) {
        this.dailyCalories = dailyCalories;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public int getTotalConsumedCalories() {
        // Calculate the number of days on the diet
        long daysOnDiet = ChronoUnit.DAYS.between(startDate, endDate) + 1;

        // Return total calories consumed
        return (int) daysOnDiet * dailyCalories;
    }
}
