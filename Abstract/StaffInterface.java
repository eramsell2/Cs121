package WeekTen.interfaces;

public class StaffInterface implements Interactable {
    private String email;
    private String password;
    private int shift;

    public StaffInterface(int shift, String email, String password) {
        this.shift = shift;
        this.email = email;
        this.password = password;

    }
    public int getShift(){
        return shift;
    }
    public void setShift(int shift){
        this.shift = shift;
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
        String combinedLogin = getEmail() + getPassword() + getShift();
        return combinedLogin;
    }
}
