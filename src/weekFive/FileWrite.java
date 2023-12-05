package weekFive;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileWrite {
    public static void main(String[] args)throws FileNotFoundException {
        File outputFile = new File("games.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String game, playtime, level;
        output.printf("%s %s %s\n", "Games", "Playtime", "Level");
        for(int i=1; i <= 3; i++){
            game = JOptionPane.showInputDialog(String.format("enter game name %d", i));
            playtime = JOptionPane.showInputDialog("Enter game playtime");
            level = JOptionPane.showInputDialog("Enter game level");
            JOptionPane.showMessageDialog(null, "Game: " + game);
            JOptionPane.showMessageDialog(null, "Playtime: " + playtime);
            JOptionPane.showMessageDialog(null, "Level: " + level);


        }
        output.close();

    }
}
