package Conditional;

import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean result = ((num%3 == 0 && num%5 == 0));

        System.out.println("Divisible by 3 && 5 is:- " +result);
    }
}
