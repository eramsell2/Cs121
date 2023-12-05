package WeekTwo;

import javax.swing.*;

public class StringDialog {
    public static void main(String[] args) {
        //dialogue box
        String Fname = JOptionPane.showInputDialog("Enter your full name: ");
        JOptionPane.showMessageDialog(null, "You entered : " + Fname);

        //integer version
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You entered: " + age);

        //double version
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter gpa: "));
        JOptionPane.showMessageDialog(null, "You entered: " + gpa);



        //string methods
        //String name = "Robin";
        //System.out.print(name);
        //replacing robin with ethan
        //name = name.concat("Ethan");
        //System.out.print(name);
        //length
       // System.out.println(name.length());
        //.charAt() -- pick out a specific character to print
        //System.out.println(name.charAt(4));
        //.replace() -- replace string
        //System.out.println(name.replace("Robin", "Jacob"));
        //.substring()
        //System.out.println(name.substring(2,4));
    }
}
