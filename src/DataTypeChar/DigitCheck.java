package DataTypeChar;

import java.util.Scanner;
public class DigitCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= '0' && ch <= '9')){
            System.out.println(ch+ " is Digits");
        }
         else{
             System.out.println("No digits");
        }
    }
}
