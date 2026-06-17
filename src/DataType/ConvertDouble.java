package DataType;

import java.util.Scanner;
public class ConvertDouble {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        double num = scan.nextDouble();

        //Double Convert into Int;
        int result = (int)num;

        System.out.println("Integer Value:- " +result);
    }
}
