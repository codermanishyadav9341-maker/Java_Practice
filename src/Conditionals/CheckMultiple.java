package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckMultiple {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            if(num%3 == 0){
                System.out.println(num+ " is multiple by 3");
            }
            else{
                System.out.println(num+ " is not multiple by 3");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
