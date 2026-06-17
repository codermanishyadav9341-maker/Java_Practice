package DataType;

import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        int num3 = scan.nextInt();

        int result = (num1+num2+num3);

        System.out.println("Sum of three elements:- " +result);
    }
}
