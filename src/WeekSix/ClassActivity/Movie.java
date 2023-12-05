package WeekSix.ClassActivity;

public class Movie {
    String genre, director, star;
    Movie(){
        this.genre = "Sci-fi";
        this.director = "Nolan";
        this.star = "DiCaprio";
    }
    Movie(String genre, String director, String star){
        this.genre = genre;
        this.director = director;
        this.star = star;
    }
}
