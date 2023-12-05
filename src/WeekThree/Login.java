package WeekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName = "e0r0bpc";
        String password = "er1234";
        String name = JOptionPane.showInputDialog("Enter your username");
        String pw = JOptionPane.showInputDialog("Enter your password");
        if (name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to cs121");
        } else if (name.equals(userName)) {
            JOptionPane.showMessageDialog(null, "incorrect password");
        } else if (pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "username is incorrect");
        } else {
            JOptionPane.showMessageDialog(null, "both username and password are incorrect");
        }
    }







    }

