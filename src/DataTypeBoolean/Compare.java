package DataTypeBoolean;

import java.util.Scanner;
public class Compare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        boolean result = (num1 == num2);

        System.out.println("Compare two number is:- " +result);

    }
}
