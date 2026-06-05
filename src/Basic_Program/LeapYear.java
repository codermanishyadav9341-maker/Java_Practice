package Basic_Program;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Years:- ");
        int year = scan.nextInt();

        if((year%400 == 0) || (year%4 == 0) && (year%100 != 0)){
            System.out.println(year+ " is Leap Years");
        }
         else{
             System.out.println(year+ " is not Leap Years");
        }
    }
}
