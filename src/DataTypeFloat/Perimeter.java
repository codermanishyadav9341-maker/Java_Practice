package DataTypeFloat;

import Array.Length;

import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Length:- ");
        float length = scan.nextFloat();

        System.out.print("Enter Breadth;- ");
        float breadth = scan.nextFloat();

        System.out.println("Perimeter of Rectangle:- " +(2*(length+breadth)));
    }
}
