package Inheritance_PracticeSet;

public class Person1 {
    public void print(String name){
        System.out.println("Name:- " +name);
    }
}
class Employee1 extends Person1{
    public void print(int id){
        System.out.println("Employee ID:- " +id);
    }
}
class Manager1 extends Employee1{
    public void Role(String role){
        System.out.println("Role:- " +role);
    }
    public static void main(String[] args){
        Manager1 manager1 = new Manager1();
        manager1.print("Manish Yadav");
        manager1.print(101);
        manager1.Role("Manager");
    }
}