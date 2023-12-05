package WeekEleven;

public class RecursionInClass {
    public static void main(String[] args) {
        //Factorial
        //1. Base Case
        //2. Recursive Call + modification
        int num = 7;
        System.out.println("The factorial of 7 is "+ factorial(num));
    }
    public static int factorial(int num){
        //1. Base case
        if(num == 0){
            return 1;

        }else{
            //2. recursive call and modification
            return num * factorial(num - 1);
        }
    }
}
