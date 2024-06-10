package pr2;


public class Student {
    private String name;
    private int id;
    private int yearOfStudy;
    private int grades;

   public Student(String name, int id, int yearOfStudy, int grades){
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
        this.grades = grades;
    }

   public  String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

    public int getYear(){
        return this.yearOfStudy;
    }
    public int getGrade(){
        return this.grades;
    }

    public void incYear(){
        this.yearOfStudy++;
    }

}