package Conditional;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("1.ADDITIONS");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDED");
        System.out.println("5.REMAINDER");

        System.out.print("Choose number(1-5):- ");
        int choose = scan.nextInt();

        switch(choose){

            case 1:
                System.out.print("Enter your first number:- ");
                int num1 = scan.nextInt();
                System.out.print("Enter your Second number:- ");
                int num2 = scan.nextInt();
                System.out.println("Result:- " +(num1+num2));
                break;

            case 2:
                System.out.print("Enter your first number:- ");
                int num = scan.nextInt();
                System.out.print("Enter your Second number:- ");
                int nu = scan.nextInt();
                System.out.println("Result:- " +(num - nu));
                break;

            case 3:
                System.out.print("Enter your first number:- ");
                int a = scan.nextInt();
                System.out.print("Enter your Second number:- ");
                int b = scan.nextInt();
                System.out.println("Result:- " +(a*b));
                break;

            case 4:
                System.out.print("Enter your first number:- ");
                int c = scan.nextInt();
                System.out.print("Enter your Second number:- ");
                int d = scan.nextInt();
                System.out.println("Result:- " +(c/d));
                break;

            case 5:
                System.out.print("Enter your first number:- ");
                int num5 = scan.nextInt();
                System.out.print("Enter your Second number:- ");
                int num6 = scan.nextInt();
                System.out.println("Result:- " +(num5 % num6));
                break;

            default:
                System.out.println("Invalid choice");

        }
        
    }
}
