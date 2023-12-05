package WeekTen;

import java.util.ArrayList;

public class courseInfo {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();
    private ArrayList<Double> gpa = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    public void addCourse(String name, int score, char letterGrade, double gpa2){
        this.names.add(name);
        this.scores.add(score);
        this.letterGrades.add(letterGrade);
        this.gpa.add(gpa2);
    }
    public void displayStudent(){
        System.out.printf("%-10s %-10f %-10c %d\n", "Name", "GPA", "GRADE", "Score");
        for(int i = 0; i<scores.size(); i++){
            System.out.printf("%-10s %-10f %-10c %d", names.get(i), gpa.get(i), letterGrades.get(i), scores.get(i));


        }
    }
    public void addName(String name){
        this.names.add(name);
    }
    public void addScore(int score){
        this.scores.add(score);
    }
    public void addGPA(double gpa2){
        this.gpa.add(gpa2);
    }
    public void addLetterGrade(char letterGrade){
        this.letterGrades.add(letterGrade);
    }
}
