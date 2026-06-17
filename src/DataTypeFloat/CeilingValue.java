package DataTypeFloat;

import java.util.Scanner;
public class CeilingValue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        float num = scan.nextFloat();

        float result = (float)Math.ceil(num);

        System.out.println("Ceiling Value:- " +result);

    }
}
