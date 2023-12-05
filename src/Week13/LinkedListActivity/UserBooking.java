package Week13.LinkedListActivity;
import java.util.LinkedList;
import java.util.List;

public class UserBooking {
    private String userName;
    private String movieTitle;
    private int runTime;
    private String genre;
    private String description;
    private LinkedList<String> theaters;
    public UserBooking(String userName, String movieTitle, int runTime, String genre, String description, LinkedList<String> theaters) {
        this.userName = userName;
        this.movieTitle = movieTitle;
        this.runTime = runTime;
        this.genre = genre;
        this.description = description;
        this.theaters = theaters;
    }
    public String getUserName() {
        return userName;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public int getRunTime() {
        return runTime;
    }
    public String getGenre() {
        return genre;
    }
    public String getDescription() {
        return description;
    }
    public LinkedList<String> getTheaters() {
        return theaters;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public void setRuntTime(int runTime){
        this.runTime = runTime;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setTheaters(LinkedList<String> theaters){
        this.theaters = theaters;
    }
    public void displayUserBooking() {
        System.out.println("Booking Details:");
        System.out.println("User Name: " + userName);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Run Time: " + runTime + " minutes");
        System.out.println("Genre: " + genre);
        System.out.println("Description: " + description);
        System.out.println("Available Theaters:");
        for (String theater : theaters) {
            System.out.println("- " + theater);
        }
    }
    public void addTheater(String theater) {
        theaters.add(theater);
    }
    public void removeTheater(String theater) {
        theaters.remove(theater);
    }
    public String getUserInfo() {
        return "User Name: " + userName + ", Movie Title: " + movieTitle;
    }

}
