package Basic_Program;

import java.util.Scanner;

public class ProductNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Product of two number is:- " +(a*b));

        scan.close();
    }
}
