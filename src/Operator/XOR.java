package Operator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class XOR {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            //===============Swap XOR Operators====================
            num1 = num1^num2;
            num2 = num1^num2;
            num1 = num1^num2;

            System.out.println("a = " +num1);
            System.out.println("b = " +num2);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input Please enter valid numeric value");
        }
    }
}
