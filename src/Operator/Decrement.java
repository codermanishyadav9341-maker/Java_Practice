package Operator;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Decrement {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            int dec = --num + - num-- + num;

            System.out.println("Decrement Operation:- " +dec);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
