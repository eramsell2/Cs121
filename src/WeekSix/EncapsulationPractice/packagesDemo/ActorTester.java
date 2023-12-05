package WeekSix.EncapsulationPractice.packagesDemo;

public class ActorTester {
    public static void main(String[] args) {
        Actor DeNiro = new Actor("Robert DeNiro", "Goodfellas", 80, 2);
        //printAge(); error
        //printNumAwards(); error
        //printName(); error
        //printBestFilm(); error
        System.out.println(DeNiro.name);
        System.out.println(DeNiro.bestFilm);
        //System.out.println(DeNiro.age); error bc private
        //System.out.println(DeNiro.numAwards); error bcuz private

    }
}
