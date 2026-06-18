package DataTypeChar;

import java.util.Scanner;
public class PreviousCharacter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        char pre = --ch;

        System.out.println("Previous Characters:- " +pre);

    }
}
