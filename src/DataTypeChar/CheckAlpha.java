package DataTypeChar;

import java.util.Scanner;
public class CheckAlpha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= 'A'  && ch <= 'Z')  || (ch >= 'a'  && ch <= 'z')){
            System.out.println(ch+ " is Alphabet");
        }
         else{
             System.out.println("No Alphabet");
        };
    }
}
