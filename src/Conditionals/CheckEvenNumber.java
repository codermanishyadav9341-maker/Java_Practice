package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckEvenNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            if(num%2 == 0){
                System.out.println(num+ " is even number");
            }
             else{
                 System.out.println(num+ " is odd number");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! please enter valid numeric value");
        }
    }
}
