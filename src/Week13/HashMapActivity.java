package Week13;

import java.util.HashMap;
import java.util.Map;

public class HashMapActivity {
    Map<String, String> movies = new HashMap<>();

    public void addKeyAndValue(String genre, String title){
        movies.put(genre, title);
    }
    public void removeMovies(String genre, String title){
        movies.remove(genre);
    }
    public void getMovies(String genre){
        movies.get(genre);
    }
    public void display(){
        movies.forEach((genre, title) -> {
            System.out.printf("Genre: %s - Title: %s\n", genre, title);

        });

    }
}
