package DataType;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();


        int rev = 0;

        int lastDigit = num%10;
        while(num != 0){
            int digit = num%10;
            rev = rev *10+digit;
            num = num/10;
        }

        System.out.println("Reverse elements:- " +rev);
    }
}
