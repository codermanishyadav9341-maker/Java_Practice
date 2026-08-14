package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckLargestNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            System.out.print("Enter Thirds number:- ");
            int num3 = scan.nextInt();

            int largest = 0;

            if((num1 >= num2) && (num1 >= num3)){
                largest = num1;
            }
             else if((num2 >= num1) && (num2 >= num3)){
                 largest = num2;
            }
              else{
                  largest = num3;
            }

              System.out.println("Largest number:- " +largest);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
