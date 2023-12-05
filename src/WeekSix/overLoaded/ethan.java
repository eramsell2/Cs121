package WeekSix.overLoaded;

import javax.swing.*;

public class ethan {
    static int age;
    int height;
    static int feet;
    int hands;
    boolean isAdult = true;

    ethan() {
        this.age = 19;
        this.height = 6;
        this.feet = 2;
        this.hands = 2;
    }

    ethan(int age) {
        this.age = age;
    }

    ethan(int age, int height, int feet, int hands) {
        this.age = age;
        this.height = height;
        this.feet = feet;
        this.hands = hands;
    }
    public static int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public static int getFeet(){
        return feet;
    }
    public int getHands(){
        return hands;
    }
    public void setAge(int age, boolean isAdult){
        if(isAdult){
            this.age = age;
        }else{
            JOptionPane.showMessageDialog(null, "This individual is not an adult");
        }
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setFeet(int feet){
        this.feet = feet;
    }
    public void setHands(int hands){
        this.hands = hands;
    }
}

