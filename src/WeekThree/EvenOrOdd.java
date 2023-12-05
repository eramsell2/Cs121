package WeekThree;
import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Enter a number");
        int NumOne = Integer.parseInt(console.nextLine());
        if(NumOne % 2 == 0){
            System.out.println(NumOne + " is even");
        }else{
            System.out.println(NumOne + " is odd");
        }
   }
}
