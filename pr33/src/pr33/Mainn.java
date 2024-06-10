package pr33;

import java.util.Vector;

class Person{
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
    void setAddress(String address){
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person[name=" + getName() + ",address=" + getAddress() +"]";
    }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    String getProgram(){
        return this.program;
    }
    void setProgram(String program){
        this.program = program;
    }
    int getYear(){
        return this.year;
        
    }
    void setYear(int year){
        this.year = year;
    }
    double getFee(){
        return this.fee;
    }
    void setFee(double fee){
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student[Person[name=" + getName() + ",address=" + getAddress() +"], program=" + getProgram() + ",year=" + getYear() + ",fee=" + getFee() + "]";
    }
}

class Staff extends Person{
    String school;
    double pay;
    Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    String getSchool(){
        return this.school;
    }
    void setSchool(String school){
        this.school = school;
    }
    double getPay(){
        return this.pay;
    }
    void setPay(double pay){
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "Staff[Person[name=" + getName() + ",address=" + getAddress() +"], school=" + getSchool() + ",pay=" + getPay() + "]";
    }
}

public class Mainn {
    public static void main(String[] args) {
        Vector<Student> StudentsVector = new Vector<>();
        Student st1 = new Student("Sayana", "KBTU", "Information systems", 2005, 9.234);
        System.out.println(st1.toString());
        StudentsVector.add(st1);
        Student st2 = new Student("Olzhas", "KBTU", "ВТиПО", 2005, 9999.234);
        System.out.println(st2.toString());
        StudentsVector.add(st2);
        Student st3 = new Student("Anelya", "KBTU", "ВТиПО", 2004, -9.234);
        System.out.println(st3.toString());
        StudentsVector.add(st3);
        //////////////////////////////////////////////
        Vector<Staff> StaffVector = new Vector<>();
        Staff staff1 = new Staff("Sayana", "KBTU", "Information systems", 999);
        System.out.println(staff1.toString());
        StaffVector.add(staff1);
        Staff staff2 = new Staff("Olzhas", "KBTU", "ВТиПО", 2);
        System.out.println(staff2.toString());
        StaffVector.add(staff2);
        Staff staff3 = new Staff("Anelya", "KBTU", "ВТиПО", 3121121);
        System.out.println(staff3.toString());
        StaffVector.add(staff3);
    }
}