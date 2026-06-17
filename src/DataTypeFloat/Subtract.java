package DataTypeFloat;

import java.util.Scanner;
public class Subtract {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        float num1 = scan.nextFloat();

        System.out.print("Enter your Second number:- ");
        float num2 = scan.nextFloat();

        System.out.println("Subtract of two number is:- " +(num1-num2));
    }
}
