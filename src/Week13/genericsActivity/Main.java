package Week13.genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods newMethod = new GenericMethods();
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.2,3.5,4.9));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Hello", "From", "Me"));
        ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList('r', 'e', 'd'));
        System.out.println("Int array List:");
        newMethod.printArrayList(intArrayList);
        System.out.println("Double list:");
        newMethod.printArrayList(doubleArrayList);
        System.out.println("String List:");
        newMethod.printArrayList(stringArrayList);
        System.out.println("Char List:");
        newMethod.printArrayList(charArrayList);


    }
}
