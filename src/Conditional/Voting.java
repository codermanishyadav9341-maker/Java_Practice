package Conditional;

import java.util.Scanner;
public class Voting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Age:- ");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println(age+ " is eligible for Voting......");
        }
         else{
             System.out.println(age+ " is not eligible for Voting..........");
        }
    }
}
