package Polymorphism_PracticeSet;

public class Student1 {
    public void student(){
        System.out.println("Default student created");
    }

    public void student(int id,String name){
        System.out.println("ID:- " +id+ "\nName:- " +name);
    }

    public static void main(String[] args){
        Student1 student1 = new Student1();

        student1.student();
        student1.student(101,"Manish Kumar yadav");
    }
}
