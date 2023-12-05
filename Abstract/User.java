package WeekTen.abstractClasses;

public abstract class User {
    private String email;
    private String password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
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
    public String toString() {
        return String.format("Email: %s%nPassword: %d%n", email, password);

    }
    public abstract String combineLogin();
    }
