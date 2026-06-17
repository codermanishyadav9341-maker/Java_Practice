package DataType;

import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        //Swap number;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +b+ " b = " +b);
    }
}
