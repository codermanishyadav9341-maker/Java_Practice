package Basic_Program;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num >= 0){
            if(num > 0){
                System.out.print(num+ " is Positive number");
            }
             else{
                 System.out.println(num+ " is Zero");
            }
        }
         else{
             System.out.println(num+ " is negative number");
        }
    }
}
