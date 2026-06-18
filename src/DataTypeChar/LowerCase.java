package DataTypeChar;

import java.util.Scanner;
public class LowerCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.print("LowerCase");
        }
         else{
             System.out.println("No Lowercase");
        }
    }
}
