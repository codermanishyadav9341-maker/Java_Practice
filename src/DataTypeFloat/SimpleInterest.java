package DataTypeFloat;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal Amount:- ");
        float principal = scan.nextFloat();

        System.out.print("Enter Rate of Interest:- ");
        float rate = scan.nextFloat();

        System.out.print("Enter Time:- ");
        float time = scan.nextFloat();

        float si = (principal*rate*time)/100;

        System.out.println("Simple Interest:- " +si);
    }
}
