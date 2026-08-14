package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            if(num1 >= num2){
                System.out.println(num1+ " is Maximum number");
            }
             else{
                 System.out.println(num2+ " is Maximum number");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter valid integer");
        }
    }
}
