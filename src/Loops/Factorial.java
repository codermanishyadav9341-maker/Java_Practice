package Loops;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long fact = 1;

        System.out.print("Enter number:- ");
        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){
            fact *= i;
        }

        System.out.println(num+ " is Factorial:- " +fact);
    }
}
