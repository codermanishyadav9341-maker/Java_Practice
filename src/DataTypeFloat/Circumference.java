package DataTypeFloat;

import java.util.Scanner;
public class Circumference {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Radius:- ");
        float radius = scan.nextFloat();

        System.out.println("Circumference of Circle:- " +(2*Math.PI*radius));

    }
}
