package DataType;

import java.util.Scanner;
public class DoubleNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        double num = scan.nextDouble();

        System.out.println("Double value of num is:- " +num);
    }
}
