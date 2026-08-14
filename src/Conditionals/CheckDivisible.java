package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckDivisible {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            if((num%3 == 0) && (num%5 == 0)){
                System.out.println(num+ " is Divisible by 3 or 5");
            }
             else{
                 System.out.println(num+ " is not Divisible by 3 or 5");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
