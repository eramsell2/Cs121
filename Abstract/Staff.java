package WeekTen.abstractClasses;

public class Staff extends User{
    private int shift;
    public Staff(String email, String password,int shift){
        super(email, password);
        this.shift = shift;
    }
    public int getShift(){
        return shift;
    }
    public void setShift(int shift){
        this.shift = shift;
    }

    @Override
    public String toString() {
        return String.format("Email: %s%nPassword: %d%nShift: %.2f%n", getShift(), getEmail(), getPassword());
    }

    @Override
    public String combineLogin() {
        String combinedLogin = getEmail() + getPassword() + getShift();
        return combinedLogin;
    }
}
