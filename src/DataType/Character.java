package DataType;

import java.util.Scanner;
public class Character {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        System.out.println("Value of ch:- " +ch);

    }
}
