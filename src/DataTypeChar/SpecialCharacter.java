package DataTypeChar;

import java.util.Scanner;
public class SpecialCharacter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
            System.out.println("Not a Special Characters");
        }
         else{
             System.out.println("Special Characters");
        }
    }
}
