package WeekSix.overLoaded;


import javax.swing.*;

public class MainEthanTest {
    public static void main(String[] args) {
        ethan past = new ethan(13, 5, 2, 2);
        ethan current = new ethan(19, 6, 2, 2);
        ethan future = new ethan();
        future.setAge(25,true);
        JOptionPane.showMessageDialog(null, future.getAge());
        future.setFeet(2);
        JOptionPane.showMessageDialog(null,future.getFeet());
        future.setHands(2);
        JOptionPane.showMessageDialog(null, future.getHands());
        future.setHeight(7);
        JOptionPane.showMessageDialog(null, future.getHeight());


    }
}
