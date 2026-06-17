package DataType;

import java.util.Scanner;
public class FloatNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        float num = scan.nextInt();

        System.out.println("Float value of num is:- " +num);

        scan.close();
    }
}
