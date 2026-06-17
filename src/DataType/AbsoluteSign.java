package DataType;

import java.util.Scanner;
public class AbsoluteSign {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        //AbsoluteSign
        System.out.println("AbsoluteSign is:- " +Math.abs(num));
    }
}
