package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckMaximumNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            System.out.print("Enter Thirds number:- ");
            int num3 = scan.nextInt();

            System.out.print("Enter fourth number:- ");
            int num4 = scan.nextInt();

            int max = 0;

            if((num1 >= num2) && (num1 >= num3) && (num1 >= num4)){
                max = num1;
            }
             else if((num2 >= num1) && (num2 >= num3) && (num2 >= num4)){
                 max = num2;
            }
              else if((num3 >= num1) && (num3 >= num2) && (num3 >= num4)){
                  max = num3;
            }
               else{
                   max = num4;
            }

               System.out.println("Maximum number is:- " +max);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
