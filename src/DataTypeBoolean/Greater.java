package DataTypeBoolean;

import java.util.Scanner;
public class Greater {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean result = (num >= 10);

        System.out.println("GreaterThan > 10 is:- " +result);

    }
}
