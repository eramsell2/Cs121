package WeekTen.abstractClasses;

public class Customer extends User{
    private int loyaltyPoints;
    public Customer(String email, String password, int loyaltyPoints){
        super(email, password);
        this.loyaltyPoints = loyaltyPoints;
    }
    public int getLoyaltyPoints(){
        return loyaltyPoints;
    }
    public void setLoyaltyPoints(int loyaltyPoints){
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String toString() {
        return String.format("Email: %s%nPassword: %d%nLoyalty Points: %.2f%n", getEmail(), getPassword(), getLoyaltyPoints());

    }

    @Override
    public String combineLogin() {
        String combinedLogin = getEmail() + getPassword() + getLoyaltyPoints();
        return combinedLogin;
    }
}
