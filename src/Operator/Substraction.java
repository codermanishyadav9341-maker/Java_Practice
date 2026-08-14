package Operator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Substraction {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            System.out.println("Substraction:- " +(num1-num2));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
