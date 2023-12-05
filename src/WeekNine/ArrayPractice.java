package WeekNine;

public class ArrayPractice {
    public static void main(String[] args) {
        //declare array
        String name1 = "ethan";
        String name2 = "Jake";
        //int
        int[] years;
        years = new int[5];

        //string
        String [] name = new String [3]; //most common way to declare array, using one line

        //float
        float [] pay = new float[3];

        //data type [] nameOfArray = new dataType [#];

        final int maxCapacity = 30;
        int [] classRoomSize = new int[maxCapacity];

        //Process the array
        String [] names = {"Libby", "Jacob", "Jessica", "John"};
        System.out.println(names[0]);
        for(int i = 0; i < names.length; i++){
            System.out.println("The names in the names array are: #" + (i+1) + names[i]);
        }

        //years[]
        years[1]++; //post
        ++years[1]; //pre

        if(names[1].length()< names[3].length()){

        }

    }
}
