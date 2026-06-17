package DataType;

import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter Side:- ");
        int side = scan.nextInt();

        System.out.println("Square number is:- " +(side*side)) ;
    }
}
