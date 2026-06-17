package DataTypeFloat;

import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        float num1 = scan.nextFloat();

        System.out.print("Enter your Second number:- ");
        float num2 = scan.nextFloat();

        System.out.print("Enter your Thirds number:- ");
        float num3 = scan.nextFloat();

        System.out.print("Enter your fourth number:- ");
        float num4 = scan.nextFloat();

        System.out.print("Enter your Fifth number:- ");
        float num5 = scan.nextFloat();

        float avg = (num1+num2+num3+num4+num5)/5.0f;

        System.out.println("Average Five number:-  " +avg);

    }
}
