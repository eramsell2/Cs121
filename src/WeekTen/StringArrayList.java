package WeekTen;

import java.util.ArrayList;

public class StringArrayList {
        ArrayList<String> names = new ArrayList<>();
        public void addName(String name){
            names.add(name);

    }
    public void removeName(String name){
            names.remove(name);
    }
    public int getSize(){
            return names.size();
    }
    public String getIndex(String name){
            return names.get(0);

    }
    public void displayName1(){
        System.out.printf("Names:%n");
        for(Object name:names){
            System.out.printf("%d%n", name);
        }
    }
    public void display2(){
        System.out.printf("Names:%n");
        for(int i = 0; i < names.size(); i++){
            System.out.printf("%d%n", names.get(i));
        }

    }



}
