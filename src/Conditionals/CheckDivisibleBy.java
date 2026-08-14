package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckDivisibleBy {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            if((num%5 == 0) && (num%11 == 0)){
                System.out.println(num+ " is Divisible by 5 or 11 ");
            }
             else{
                 System.out.println(num+ " is not divisible by 5 or 11");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
