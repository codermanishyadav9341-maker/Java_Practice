package Operator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class NOTOperation {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            boolean result = ((num1 != 0) != (num2 != 0));
            System.out.println("NOT Operations:- " +result);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
