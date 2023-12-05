package WeekTen.interfaces;

import static org.junit.jupiter.api.Assertions.*;

class InteractableTest {
    public static void main(String[] args) {
        CustomerInterface customer1 = new CustomerInterface(175, "er@gmail.com", "er1234");
        System.out.printf("Customer info: %.2f%n", customer1.combineLogin());
        StaffInterface staff1 = new StaffInterface(2, "er123@gmail.com", "Ramsell456");
        System.out.printf("Staff info: %.2f%n", staff1.combineLogin());
    }

}