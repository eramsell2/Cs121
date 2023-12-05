package WeekNine;
import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args) {
        String [] title = new String [3];
        String [] genre = new String [3];
        int [] runtime = new int[3];
        Scanner console = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Enter in the movie title " + (i+1) + ":");
            title[i] = console.nextLine();
            System.out.println("Enter the movie runtime " + (i+1) + ":");
            runtime[i] = Integer.parseInt(console.nextLine());
            System.out.println("Enter the movie genre " + (i+1) + ":");
            genre[i] = console.nextLine();
        }
        System.out.println("The movie inventory");
        System.out.println("--------------------------");
        //header
        System.out.println("Title\tGenre\tRuntime");
        for(int i = 0; i<genre.length;i++ ){
            System.out.println("Movie " + (i+1) + ":" + title[i] + "\t" + genre[i] + "\t" + runtime[i]);
        }
    }
}
