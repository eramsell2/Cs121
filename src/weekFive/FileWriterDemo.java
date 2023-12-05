package weekFive;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //instance of the file and print writer
        File outputFile = new File("myCourse.txt");
        PrintWriter output = new PrintWriter(outputFile);
        //variabls
        String course, credits, score;
        output.printf("%s %s %s\n", "Courses", "Credits", "Score");
        for(int i=1; i <= 3; i++){
            course = JOptionPane.showInputDialog(String.format("enter course name %d", i));
            credits = JOptionPane.showInputDialog("Enter course credits");
            score = JOptionPane.showInputDialog("Enter course score");
            output.printf("%s %s %s\n", course, credits, score);


        }output.close();
    }
}
