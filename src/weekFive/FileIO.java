package weekFive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileIO  {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("games.txt");

        try {

            // Read file
            Scanner console = new Scanner(file);
            String header = console.nextLine();
            while (console.hasNextLine()) {
                String game = console.next();
                int playtime = Integer.parseInt(console.next());
                int level = Integer.parseInt(console.next());
                System.out.printf("% - 7s %3d %7d\n", game, playtime, level);


            }
        }catch(FileNotFoundException e){
           // e.printStackTrace();
            System.err.println("FILE NOT FOUND YOUR PATH HAS ISSUES");
        }
    }
}
