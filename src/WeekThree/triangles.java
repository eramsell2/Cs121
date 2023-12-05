package WeekThree;
import java.util.Scanner;

import javax.swing.*;

public class triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of side1");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        if (side1 != side2 && side1 != side3 && side2 != side3) {
            System.out.println("The triangle is scalene.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            if (side1 == side2 && side1 == side3) {
                System.out.println("The triangle is equilateral.");
            } else {
                System.out.println("The triangle is isosceles.");
            }
        }
    }
}