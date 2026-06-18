package DataTypeChar;

import java.util.Scanner;
public class ConvertLowerCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter UpperCase Characters:- ");
        char ch = scan.next().charAt(0);

        char upp = Character.toLowerCase(ch);

        System.out.println("Convert LowerCase:- " +upp);
    }
}
