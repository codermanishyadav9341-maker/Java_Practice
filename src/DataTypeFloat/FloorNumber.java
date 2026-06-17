package DataTypeFloat;

import  java.util.Scanner;
public class FloorNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        float num = scan.nextFloat();

        float result = (float)Math.floor(num);

        System.out.println("Floor Value:- " +result);

    }
}
