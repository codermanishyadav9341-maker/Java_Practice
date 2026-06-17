package DataType;

import java.util.Scanner;
public class ConvertInt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        // Double convert into Int;

        double result = num;
        System.out.println("Double Value:- " +result);
    }
}
