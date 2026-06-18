package DataTypeBoolean;

import java.util.Scanner;
public class LessThan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean result = (num <= 50);

        System.out.println("LessThan < 50 is:- " +result);

    }
}
