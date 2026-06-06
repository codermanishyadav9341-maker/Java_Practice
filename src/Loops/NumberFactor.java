package Loops;

import java.util.Scanner;
public class NumberFactor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int num = scan.nextInt();

        long fact = 1;

        for(int i = 1; i<=num; i++){
            fact *= i;
        }

        System.out.println(num+ " is factorial is:- " +fact);

        scan.close();
    }
}
