package Conditional;

import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num >= 0){
            System.out.println(num+ " is Positive number");
        }
         else{
             System.out.println(num+ " is negative number");
        }
    }
}
