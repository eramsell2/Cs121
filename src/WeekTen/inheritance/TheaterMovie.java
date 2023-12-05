package WeekTen.inheritance;

public class TheaterMovie extends Movie{
    private String leadActor;
    public TheaterMovie(int runtime, String genre, String name, String leadActor){
        super(runtime,genre,name);
        this.leadActor = leadActor;

    }
    public String getLeadActor(){
        return leadActor;
    }
    public void setLeadActor(String leadActor){
        this.leadActor = leadActor;
    }

    @Override
    public String toString(){
        return String.format("Name: %s%nGenre: %d%nRuntime: %.2f%nLead: %s%n", getName(), getGenre(), getRuntime(), getLeadActor());


    }

}
