package WeekSix.ClassActivity;

public class Tester {
    public static void main(String[] args) {
        Game Overwatch = new Game("PS5", "FPS", "Blue");
        System.out.println(Overwatch.console);
        System.out.println(Overwatch.genre);
        System.out.println(Overwatch.color);
        Movie Inception = new Movie("Sci-fi", "Nolan", "DiCaprio");
        System.out.println(Inception.genre);
        System.out.println(Inception.director);
        System.out.println(Inception.star);
    }
}
