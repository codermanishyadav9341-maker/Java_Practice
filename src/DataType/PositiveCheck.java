package DataType;

import java.util.Scanner;
public class PositiveCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num > 0){
            System.out.println(num+ " is Positive number");
        }
         else{
             System.out.println(num+ " is Negative number");
        }
    }
}
