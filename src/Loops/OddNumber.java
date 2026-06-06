package Loops;

import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num%2 != 0){
            System.out.println(num+ " is Odd number");
        }
         else{
             System.out.println(num+ " is even number");
        }
    }
}
