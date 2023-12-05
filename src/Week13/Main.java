package Week13;

public class Main {
    public static void main(String[] args) {
        HashMapActivity newMap = new HashMapActivity();
        newMap.addKeyAndValue("Sci-Fi", "Inception");
        newMap.addKeyAndValue("Sci-Fi", "Interstellar");
        newMap.addKeyAndValue("Horror", "Talk to Me");
        newMap.display();
        newMap.removeMovies("Sci-Fi", "Inception");
        newMap.display();


    }
}
