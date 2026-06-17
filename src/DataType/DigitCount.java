package DataType;

import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int count = 0;

        if(num == 0){
            count = 1;
        }
         else{
             Math.abs(num);  // negative number handle karega
            while(num > 0){
                count++;
                num = num/10;
            }
        }

         System.out.println("Count Digits:- " +count);
    }
}
