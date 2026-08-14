package Operator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.print("Enter Shift:- ");
            int shift = scan.nextInt();

            int result = num << shift;

            System.out.println("Left Shift:- " +result);

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
