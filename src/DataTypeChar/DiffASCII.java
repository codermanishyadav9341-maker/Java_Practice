package DataTypeChar;

import java.util.Scanner;
public class DiffASCII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Characters:- ");
        char ch1 = scan.next().charAt(0);

        System.out.print("Enter Second Characters:- ");
        char ch2 = scan.next().charAt(0);

        int result = (ch2 - ch1);

        System.out.println("Two Characters Difference ASCII Values:- " +result);
    }
}
