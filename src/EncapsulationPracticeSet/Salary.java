package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Salary {
    private double salary;

    public Salary(double salary){
        setSalary(salary);
    }

    public void setSalary(double salary){
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
         this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Salary:- ");
            double salary = scan.nextDouble();

            Salary sa = new Salary(salary);

            System.out.println("Salary set successfully:- " +sa.getSalary());
        }
        catch(InputMismatchException e){
            System.out.println("Please enter integer value");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
