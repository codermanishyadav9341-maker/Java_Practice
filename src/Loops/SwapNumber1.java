package Loops;

import java.util.Scanner;
public class SwapNumber1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("-------------=:Before Swap:=---------------");
        System.out.println("a = " +a+ "\nb = " +b);

        a = a+b;
        b = a-b; // without using thirds variable;
        a = a-b;

        System.out.println("------------=:After Swap:=---------------");
        System.out.println("a = " +a+ "\nb = " +b);

    }
}
