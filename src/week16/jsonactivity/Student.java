package week16.jsonactivity;

public class Student {
    String name;
    int id;
    String major;

    public Student(String name, int id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
