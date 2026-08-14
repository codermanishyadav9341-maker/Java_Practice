package Operator;

import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int num1 = scan.nextInt();

            System.out.print("Enter Second number:- ");
            int num2 = scan.nextInt();

            System.out.println("====================Before Swap======================");
            System.out.println("a = " +num1);
            System.out.println("b = " +num2);

            System.out.println("=======================After Swap=========================");
            num1 = num1+num2;
            num2 = num1-num2;
            num1 = num1-num2;

            System.out.println("a = " +num1);
            System.out.println("b = " +num2);
        }
    }
}
