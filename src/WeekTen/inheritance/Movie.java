package WeekTen.inheritance;

public class Movie {
    private int runtime;
    private String name;
    private String genre;

    public Movie(int runtime, String genre, String name){
        this.runtime = runtime;
        this.genre = genre;
        this.name = name;
    }
    public int getRuntime(){
        return runtime;
    }
    public void setId(int runtime){
        this.runtime = runtime;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
