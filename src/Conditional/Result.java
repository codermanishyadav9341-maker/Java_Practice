package Conditional;

import java.util.Scanner;
public class Result {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks:- ");
        int marks = scan.nextInt();

        if(marks >= 33){
            System.out.println("Pass..........");
        }
          else{
              System.out.println("fail..........");
        }
    }
}
