package Loops;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Year:- ");
        int year = scan.nextInt();

        if((year%400 == 0) || (year%100 != 0) && (year%4 == 0)){
            System.out.println(year+ " is Leap Year");
        }
         else{
             System.out.print(year+ " is not year");
        }

         scan.close();
    }
}
