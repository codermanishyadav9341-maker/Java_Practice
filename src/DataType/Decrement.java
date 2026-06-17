package DataType;

import java.util.Scanner;
public class Decrement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int dec = --num;

        System.out.println("Decrement number:- " +dec);
    }
}
