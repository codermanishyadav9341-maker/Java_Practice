package Basic_Program;

import java.util.Scanner;
public class LargestNUmber1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("Largest number is:- " +num1);
        }
         else{
             System.out.println("Largest number is:- " +num2);
        }

         scan.close();
    }
}
