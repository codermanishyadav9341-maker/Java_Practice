package Operator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Increment {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            int inc = num++ + num++ + ++num;
            System.out.println("Increment Operation:- " +inc);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
