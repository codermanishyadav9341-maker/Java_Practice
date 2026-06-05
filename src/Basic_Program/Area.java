package Basic_Program;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Radius:- ");
        double radius = scan.nextInt();

        System.out.println("Area of Circle:- " +(Math.PI*radius*radius));

        scan.close();
    }
}
