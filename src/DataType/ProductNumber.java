package DataType;

import java.util.Scanner;
public class ProductNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        System.out.println("Product of two number is:- " +(num1*num2));

        scan.close();
    }
}
