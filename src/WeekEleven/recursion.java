package WeekEleven;

public class recursion {
    public static void countDown(int num){
        if(num == 0){
            System.out.println("Blast off!");

        }else{
            System.out.println(num);
            countDown(num - 1);
        }
    }
    public static void alphaBackwards(char alphaLetter){
        if(alphaLetter == 'a'){
            System.out.println(alphaLetter);
        }else{
            System.out.println(alphaLetter);
            alphaBackwards((char)(alphaLetter - 1));
        }
    }
}
