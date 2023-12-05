package WeekEleven.SortingActivity;

import java.util.Scanner;

public class Sorting {
    public static int[] getArray(){
        int[] array = new int[5];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 5 unsorted integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        return array;


    }
    public static int[] sortArray(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int index = 0; index < array.length - i - 1; index++){
                if(array[index] > array[index+1]){
                    temp = array[index];
                    array[index] = array[index+1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;


    }
}
