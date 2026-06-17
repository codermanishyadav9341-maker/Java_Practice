package DataType;

import java.util.Scanner;
public class Ascii {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        int ch1 = ch;

        System.out.println("ASCII Value is:- " +ch1);

    }
}
