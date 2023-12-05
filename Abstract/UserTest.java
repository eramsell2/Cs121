package WeekTen.abstractClasses;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ethan123@gmail.com", "ethan123", 175);
        System.out.printf("Your info: %.2f%n", customer1.combineLogin());
        Staff staff1 = new Staff("er456@gmail.com", "ethan456", 2);
        System.out.printf("Info: %.2f%n", staff1.combineLogin());
    }

}