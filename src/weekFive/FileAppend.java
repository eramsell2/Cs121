package weekFive;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) {
        try{
            FileWriter filewriter = new FileWriter("games.txt", true);
            PrintWriter output = new PrintWriter(filewriter);
            String game = JOptionPane.showInputDialog("Enter game name");
            String playtime = JOptionPane.showInputDialog("Enter game playtime");
            String level = JOptionPane.showInputDialog("Enter game level");
            output.printf(" %n%s %s %s", game, playtime, level);
            filewriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("FIle issue");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
