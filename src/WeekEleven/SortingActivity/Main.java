package WeekEleven.SortingActivity;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Sorting newSort = new Sorting();
        int[] newArray = newSort.getArray();
        for(int num : newArray){
            System.out.println(num);
        }
        int [] sorted = newSort.sortArray(newArray);
        for(int integer : sorted){
            System.out.println(integer);
        }


    }
}
