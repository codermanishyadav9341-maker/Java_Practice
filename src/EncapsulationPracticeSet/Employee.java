package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Employee {
    private double salary;

    public Employee(double salary){
        setSalary(salary);
    }

    public void setSalary(double salary){
        if(salary >= 0){
            this.salary = salary;
        }
         else{
             throw new IllegalArgumentException("Salary cannot be negative");
        }
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Salary:- ");
            double salary = scan.nextDouble();

            Employee employee = new Employee(salary);
            System.out.print("------------------:Employee Details:--------------------");
            System.out.println("\nEmployee salary:- " +employee.getSalary());
        }
        catch(InputMismatchException e){
            System.out.println("Please enter double value");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
