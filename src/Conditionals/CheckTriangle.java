package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first angle:- ");
            int angle1st = scan.nextInt();

            System.out.print("Enter Second angle:- ");
            int angle2nd = scan.nextInt();

            System.out.print("Enter Thirds angle:- ");
            int angle3rd = scan.nextInt();

            if((angle1st > 0) && (angle2nd > 0) && (angle3rd > 0)){
                if((angle1st + angle2nd + angle3rd) == 180){
                    System.out.println("This triangle is valid");
                }
                 else{
                     System.out.println("This triangle is not valid");
                }
            }
             else{
                 System.out.println("Angle cannot be negative");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
