package WeekSix.EncapsulationPractice.packagesDemo;

public class Actor {
    public String name;
    public String bestFilm;
    private int age;
    private int numAwards;

    Actor(){
        this.name = "Robert DeNiro";
        this.bestFilm = "Goodfellas";
        this.age = 80;
        this.numAwards = 2;
    }
    Actor(String name, String bestFilm, int age, int numAwards){
        this.name = name;
        this.bestFilm = bestFilm;
        this.age = age;
        this.numAwards = numAwards;
    }

    public int printAge(){
        System.out.println(age);
        return age;
    }
    private int printNumAwards(){
        System.out.println(numAwards);
        return numAwards;
    }
    protected void printName(){
        System.out.println(name);
    }
    void printBestFilm(){
        System.out.println(bestFilm);
    }
}
