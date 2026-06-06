package Loops;

import java.util.Scanner;
public class InfiniteNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){
            System.out.print(i);
        }
    }
}
