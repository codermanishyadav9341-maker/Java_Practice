package Basic_Program;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Length:- ");
        int length = scan.nextInt();

        System.out.print("Enter Breath:- ");
        int breath = scan.nextInt();

        System.out.println("Area of Rectangle is:- " +(length*breath));

        scan.close();
    }
}
