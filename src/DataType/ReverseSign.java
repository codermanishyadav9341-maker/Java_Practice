package DataType;

import java.util.Scanner;
public class ReverseSign {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        // ReverseSign
        System.out.println("Reverse Sign:- " +(-num));
    }
}
