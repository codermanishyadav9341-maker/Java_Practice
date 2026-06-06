package Loops;

import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ||(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
            System.out.println(ch+ " is Vowel");
        }
         else{
             System.out.println(ch+ " is Consonant");
        }

         scan.close();
    }
}
