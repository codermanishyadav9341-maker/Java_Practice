package DataTypeChar;

import java.util.Scanner;
public class ConvertUpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter LowerCase Characters:- ");
        char ch = scan.next().charAt(0);

        char low = Character.toUpperCase(ch);

        System.out.println("ConvertUpperCase:- " +low);
        
    }
}
