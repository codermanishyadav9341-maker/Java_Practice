package Loops;

import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("---------=:Before Swap:=-----------");
        System.out.println("a = " +a+ "\nb = " +b);

        System.out.println("----------=:After Swap:=------------");
                   int temp = a;    // using thirds variable
                       a = b;
                       b = temp;
                       System.out.println("a = " +a+ "\nb = " +b);
    }
}
