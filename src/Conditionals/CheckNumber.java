package Conditionals;

import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            if(num >= 0){
                if(num > 0){
                    System.out.println(num+ " is Positive number");
                }
                 else{
                     System.out.println(num+ " is Zero number");
                }
            }
             else{
                 System.out.println(num+ " is negative number");
            }
        }
    }
}
