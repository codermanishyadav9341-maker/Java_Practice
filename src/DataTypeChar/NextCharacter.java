package DataTypeChar;

import java.util.Scanner;
public class NextCharacter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        char next = ++ch;

        System.out.println("Next Characters:- " +next);

    }
}
