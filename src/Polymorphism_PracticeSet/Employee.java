package Polymorphism_PracticeSet;

public class Employee {
    public void calculateSalary(int salary){
        System.out.println("Employee salary:- " +salary);
    }
}
class Developer extends Employee{
    @Override
    public void calculateSalary(int salary){
        System.out.println("Developer salary:- " +salary);
    }
}
class Intern extends Employee{
    @Override
    public void calculateSalary(int salary){
        System.out.println("Intern Salary:- " +salary);
    }

    public static void main(String[] args){
        Employee[] employee = {
                new Employee(),
                new Developer(),
                new Intern()

        };

        for(Employee employee1: employee){
            employee1.calculateSalary(5000);
        }
    }
}