package WeekTwo;
import javax.swing.*;
public class wordgame {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name here: ");
        JOptionPane.showMessageDialog(null, "You entered: " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age here: "));
        JOptionPane.showMessageDialog(null, "You entered: " + age);
        String city = JOptionPane.showInputDialog("What city do you live in?");
        JOptionPane.showMessageDialog(null, "You live in: " + city);
        String college = JOptionPane.showInputDialog("What college do you attend?");
        JOptionPane.showMessageDialog(null, "You attend: " + college);
        String major = JOptionPane.showInputDialog("What's your major?");
        JOptionPane.showMessageDialog(null, "Your major is:" + major);
        String animal = JOptionPane.showInputDialog("What's your favorite animal?");
        JOptionPane.showMessageDialog(null, "Your favorite animal is: " + animal);
        String Pname = JOptionPane.showInputDialog("What's your pet's name?");
        JOptionPane.showMessageDialog(null, "Your pet's name is: " + Pname);
        String story = String.format("Many centuries ago, there lived a great wizard by the name of " + name + " who resided in the ancient Roman city of " + city + ". When this legendary wizard reached the age of " + age + "%n, they decided to study at the prestigious monastery at " + college + ". After 4 long summers," + name + " completed their studies with a certification in " + major + ". %n A very generous old friend gifted them a " + animal + " by the name of " + Pname + ", and they lived happily ever after, or did they...?");
        System.out.print(story);
    }
}
