package weekFive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("games.txt");

        try{
            Scanner console = new Scanner(file);
            while (console.hasNextLine()){
                String game = console.nextLine();
                int playtime = Integer.parseInt(console.nextLine());
                int level = Integer.parseInt(console.nextLine());
            }
        }catch(FileNotFoundException e){
            System.err.println("File issue");
        }
    }
}
