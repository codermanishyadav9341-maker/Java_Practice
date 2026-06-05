package Basic_Program;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first numbers:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Sum of two number is:- " +(a+b));

        scan.close();
    }
}
