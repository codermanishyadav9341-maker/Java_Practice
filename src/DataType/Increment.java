package DataType;

import java.util.Scanner;
public class Increment {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int inc = ++num;

        System.out.println("Increment number is:- " +inc);

        scan.close();
    }
}
