package WeekSix;

public class CarClass {
    //Member Variables/Instant variables/fields
    String make,model,VIN,color;
    int year;
    int miles;
    boolean isElectric;

    //default constructor
    //Constructors
    CarClass(){
        this.year = 2000;
        this.make = "empty";
        this.model = "empty";
        this.VIN = "12345rtyhg678";
        this.color = "White";


    }
    //overloading constructor
    CarClass(String make, String model, int year, int miles){
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
    }
    //SETTERS and GETTERS
    public void setYears(int YEARS){
        this.year = YEARS;
    }
    //Getters
    //accesor method
    public int getYear(){
        return year;
    }

}
