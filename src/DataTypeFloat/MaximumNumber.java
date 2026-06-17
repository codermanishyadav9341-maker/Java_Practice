package DataTypeFloat;

import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        float num1 = scan.nextFloat();

        System.out.print("Enter your Second number:- ");
        float num2 = scan.nextFloat();

//        if(num1 > num2){
//
//        }

        System.out.println("Maximum number is:- " +Math.max(num1,num2));
    }
}
