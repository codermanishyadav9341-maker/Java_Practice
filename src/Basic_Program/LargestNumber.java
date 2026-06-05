package Basic_Program;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        System.out.print("Enter your third number:- ");
        int num3 = scan.nextInt();

        if((num1 > num2) && (num1 > num3)){
            System.out.println("Largest number is:- " +num1);
        }
         else if((num2 > num1) && (num2 > num3)){
             System.out.println("Largest number is:- " +num2);
        }
          else{
              System.out.println("Largest number is:- " +num3);
        }
    }
}
