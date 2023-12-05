package Week13.genericsActivity;

import java.util.ArrayList;

public class GenericMethods {
    public void printArrayList(ArrayList<?> arrayList){
        for(Object element : arrayList){
            System.out.println(element + " ");
        }
        System.out.println();

    }
}
