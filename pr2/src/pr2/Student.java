package pr2;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id, int yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name, my dear client:  ");
        String name = sc.nextLine();

        System.out.print("Enter your id, please:  ");
        int id = sc.nextInt();

        System.out.print("Enter the year of the study:  ");
        int yearOfStudy = sc.nextInt();

        Student student1 = new Student(name, id, yearOfStudy);

        System.out.println("Student's name:  " + student1.getName());
        System.out.println("Student's id :  " + student1.getId());
        System.out.println("Year of the study:  " + student1.getYearOfStudy());


        student1.incrementYearOfStudy();

        System.out.println("Next year you will be a " + student1.getYearOfStudy() + " year student. My congratulations!!!");

        sc.close();
    }
}