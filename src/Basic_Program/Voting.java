package Basic_Program;

import java.util.Scanner;
public class Voting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Age:- ");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("Eligible for Voting");
        }
         else{
             System.out.println("Not eligible for Voting");
        }
    }
}
