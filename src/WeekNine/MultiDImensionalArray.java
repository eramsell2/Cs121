package WeekNine;

public class MultiDImensionalArray {
    public static void main(String[] args) {
        String [][] names = {
                {"Ethan", "Jake", "Rob"},
                {"ian", "kevin", "kobe"},
                {"James", "Jim", "Nic"}
        };
        int [][] nums = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}

        };
        //[row]  [column]
        //calling from array
        System.out.println(names[1][2]);
        //replace position
        names[1][2] = "Tom";
        System.out.println(names[1][2]);

    }
}
