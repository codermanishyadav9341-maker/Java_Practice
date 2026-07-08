package Polymorphism_PracticeSet;

public class Person {
    public void displayRole(){
        System.out.println("One person has different role");
    }
}
class Student extends Person{
    @Override
    public void displayRole(){
        System.out.println("Role: Student");
    }
}
class Teacher extends Person{
    @Override
    public void displayRole(){
        System.out.println("Role: Teacher");
    }

    public static void main(String[] args){
        Person[] person = {
                new Student(),
                new Teacher()
        };

        for(Person person1 : person){
            person1.displayRole();
        }
    }
}