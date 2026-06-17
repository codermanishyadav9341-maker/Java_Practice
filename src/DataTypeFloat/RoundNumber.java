package DataTypeFloat;

import java.util.Scanner;
public class RoundNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Round number:- ");
        float num = scan.nextFloat();

        float result = Math.round(num);

        System.out.println("Round number:- " +result);

    }
}
