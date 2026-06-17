package DataTypeFloat;

import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        float num = scan.nextFloat();


        System.out.println("SquareRoot is:- " +Math.sqrt(num));
    }
}
