package Week13.LinkedListActivity;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        UserBooking book1 = new UserBooking("Ethan456", "Inception", 120, "Sci-Fi","Dreaming", new LinkedList<>());
        book1.addTheater("AMC Theater");
        book1.addTheater("Regal Cinema");
        book1.addTheater("The roxy");
        book1.addTheater("Mary Max");
        book1.getUserInfo();
        book1.getDescription();
        book1.getRunTime();
        book1.getGenre();
        book1.getTheaters();
        book1.getMovieTitle();
        book1.displayUserBooking();
        book1.removeTheater("Regal Cinema");
        book1.displayUserBooking();


        UserBooking book2 = new UserBooking("Jacob345", "Talk to me", 120, "Horror", "Talk to the dead", new LinkedList<>());
        book2.addTheater("AMC Theater");
        book2.addTheater("Super Cool Cinema");
        book2.addTheater("Hawkins");
        book2.addTheater("Willow Knolls");
        book2.getUserInfo();
        book2.getDescription();
        book2.getRunTime();
        book2.getGenre();
        book2.getTheaters();
        book2.getMovieTitle();
        book2.displayUserBooking();
        book2.removeTheater("Hawkins");
        book2.displayUserBooking();

    }
}
