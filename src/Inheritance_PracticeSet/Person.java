package Inheritance_PracticeSet;

public class Person {
    public void printName(String name){
        System.out.println("Name:- " +name);
    }
}
class Student extends Person{
    public void printCourse(String course){
        System.out.println("Course:- " +course);
    }

    public static void main(String[] args){
        Student student = new Student();
        student.printName("Manish Yadav");
        student.printCourse("BCA");
    }
}