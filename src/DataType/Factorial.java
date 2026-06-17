package DataType;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int fact = 1;

        while(num > 0){
            fact *= num;
            num--;
        }

        System.out.println("Factorial number is:- " +fact);
    }
}
