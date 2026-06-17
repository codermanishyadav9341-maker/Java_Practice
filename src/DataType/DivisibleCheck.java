package DataType;

import java.util.Scanner;
public class DivisibleCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean result = (num%5 == 0);
        System.out.println("Divisible by 5 is:- " +result);

    }
}
