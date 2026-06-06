package Polymorphism;

public class Student {

    public void printDetails(String name,int age){
        System.out.println("Student3 Name:- " +name);
        System.out.println("Age:- " +age);
    }

    public void printDetails(String name,int age,String course){
        System.out.println("Student3 Name:- " +name);
        System.out.println("Age:- " +age);
        System.out.println("Course:- " +course);
    }

    public static void main(String[] args){
        Student ss = new Student();
        ss.printDetails("Manish Yadav",23);
        ss.printDetails("Ronit kumar",23,"BCA");


    }
}
