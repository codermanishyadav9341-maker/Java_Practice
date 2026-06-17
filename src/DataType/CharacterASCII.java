package DataType;

import java.util.Scanner;
public class CharacterASCII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters ASCII Values:- ");
        int num = scan.nextInt();

        char ch = (char)num;

        System.out.println("ASCII Value:- " +ch);

    }
}
