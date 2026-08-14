package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Year:- ");
            int year = scan.nextInt();

            if((year%400 == 0) || (year%100 != 0) && (year%4 == 0)){
                System.out.println(year+ " is Leap year");
            }
             else{
                 System.out.println(year+ " is not Leap year");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
