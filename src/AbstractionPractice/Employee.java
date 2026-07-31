package AbstractionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
abstract class Employee {
    abstract double calculateSalary();
}

class Manager extends Employee{
   private double salary;
    //Constructor;
    public Manager(double salary){
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be positive");
        }
         this.salary = salary;
    }
    @Override
    public double calculateSalary(){
        return salary;
    }
}
class Developer extends Employee{
   private double salary;
    //Constructor;
    public Developer(double salary){
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be positive");
        }
         this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Manager Salary:- ");
            double salary = scan.nextDouble();

            System.out.print("Enter Developer Salary:- ");
            double salaryDev = scan.nextDouble();

            Employee manager = new Manager(salary);
            manager.calculateSalary();

            Employee developer = new Developer(salaryDev);
            developer.calculateSalary();

            System.out.println("Manager Salary:- " +manager.calculateSalary());
            System.out.println("Developer Salary:- " +developer.calculateSalary());
        }
        catch (InputMismatchException e){
            System.out.println("Invalid! Please enter valid number number");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}