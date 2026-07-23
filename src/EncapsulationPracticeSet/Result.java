package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Result {
    private double marks;

    public Result(double marks){
        setMarks(marks);
    }

    public void setMarks(double marks){
        if(marks >= 0 && marks < 100){
            this.marks = marks;
        }
         else{
             throw new IllegalArgumentException("Invalid marks! Marks between 0 and 100");
        }
    }

    public double getMarks(){
        return  marks;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter marks:- ");
            double marks = scan.nextDouble();

            Result result = new Result(marks);

            System.out.println("Marks set successfully:- " +result.getMarks());
        }
        catch(InputMismatchException e){
            System.out.println("Please enter integer marks");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
