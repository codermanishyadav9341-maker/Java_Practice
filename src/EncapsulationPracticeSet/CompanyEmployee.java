package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CompanyEmployee {
    private double salary;

    //Constructors;
    public CompanyEmployee(double salary){
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be positive");
        }
         this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void addBonus(double bonus){
        if(bonus < 0){
            throw new IllegalArgumentException("Bonus must be positive");
        }
         this.salary += bonus;
    }


    public void totalSalary(){
        System.out.println("Total Salary:- " +salary);
    }
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter salary:- ");
            double salary = scan.nextDouble();

            System.out.print("Enter Bonus:- ");
            double bonus = scan.nextDouble();

            CompanyEmployee companyEmployee = new CompanyEmployee(salary);
            companyEmployee.addBonus(bonus);

            System.out.println("Bonus:- " +bonus);
            companyEmployee.totalSalary();

        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter a valid numeric value");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
