package DataType;

import java.util.Scanner;
public class RemainderNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        System.out.println("Remainder by:- " +(num1%num2));

    }
}
