package DataType;

import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int sum = 0;
        while(num > 0){
            int digit = num%10;
              sum = sum + digit;
              num = num/10;
        }

        System.out.println("Sum of Digits:- " +sum);
    }
}
