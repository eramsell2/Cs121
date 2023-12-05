package WeekTen.interfaces;

public class CustomerInterface implements Interactable{
    private String email;
    private String password;
    private int loyaltyPoints;

    public CustomerInterface(int loyaltyPoints, String email, String password){
        this.loyaltyPoints = loyaltyPoints;
        this.email = email;
        this.password = password;
    }
    public int getLoyaltyPoints(){
        return loyaltyPoints;
    }
    public void setLoyaltyPoints(int loyaltyPoints){
        this.loyaltyPoints = loyaltyPoints;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String combineLogin(){
        String combinedLogin = getEmail() + getPassword() + getLoyaltyPoints();
        return combinedLogin;
    }
}
