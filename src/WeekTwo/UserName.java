package WeekTwo;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Enter your first and last name");
       String Fname = console.nextLine();
       System.out.println(Fname.toLowerCase());
       System.out.println(Fname.toUpperCase());
       //StringBuilder
        StringBuilder reverseFname = new StringBuilder(Fname);
        System.out.println(reverseFname.reverse());


    }
}
