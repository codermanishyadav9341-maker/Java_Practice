package DataTypeFloat;

import java.util.Scanner;
public class CalculatePer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Obtain Marks:- ");
        float obtain = scan.nextFloat();

        System.out.print("Enter Total Marks:- ");
        float total = scan.nextFloat();

        float per = (obtain/total)*100.0f;

        System.out.println("Percentage:- " +per);


    }
}
