package DataType;

import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Base:- ");
        int base = scan.nextInt();

        System.out.print("Enter Power:- ");
        int power = scan.nextInt();


        int result = 1;
        for(int i = 1; i<=power; i++){
            result *= base;
        }

        System.out.println("Result:- " +result);
    }
}
