package WeekTwo;
import java.util.Scanner;
public class UserMath {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your first integer");
        int NumOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer");
        int NumTwo = Integer.parseInt(console.nextLine());

        //Addition
        int add = (NumOne + NumTwo);
        System.out.printf(" %d  +  %d  =  %d%n", NumOne, NumTwo, add);

        //Subtraction
        int sub = (NumOne - NumTwo);
        System.out.printf(" %d  -  %d  =  %d%n", NumOne, NumTwo, sub);

        //Multiplication
        int multiply = (NumOne * NumTwo);
        System.out.printf(" %d  *  %d  =  %d%n", NumOne, NumTwo, multiply);

        //Division
        int division = (NumOne/NumTwo);
        System.out.printf(" %d / %d = %d%n ", NumOne, NumTwo, division);

        //sqrt
        double sqrt1 = Math.sqrt(NumOne);
        System.out.printf("The square root of %d is %.2f  ", NumOne, sqrt1);

        //Power
        double pow = Math.pow(NumOne, NumTwo);
        System.out.printf("The power of %d is %.2f  ", NumOne, pow);

        //Logarithm
        double logar = Math.log(NumOne);
        System.out.printf("The Log of %d is : %.2f   ", NumOne, logar);


    }
}
