package Inheritance_PracticeSet;

public class Employee {
    public void printId(int id){
        System.out.println("Employee1 ID:- " +id);
    }
}
class Manager extends Employee {
    public void printDesign(String design){
        System.out.println("Designation:- " +design);
    }

    public static void main(String[] args){
        Manager manager = new Manager();
        manager.printId(100);
        manager.printDesign("Manager");
    }


}