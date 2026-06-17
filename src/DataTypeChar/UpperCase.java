package DataTypeChar;

import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        char ch = scan.next().charAt(0);

       if(ch >= 'A' && ch <= 'Z'){
           System.out.println("UpperCase");
       }
        else{
            System.out.println("Not UpperCase");
       }
    }
}
