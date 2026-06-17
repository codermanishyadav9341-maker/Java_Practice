package DataTypeFloat;

import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Celsius Temperature:- ");
         float celsius = scan.nextFloat();

         float result = (9.0f/5.0f*celsius+32);   //celsius convert into Fahrenheit;

         System.out.println("Fahrenheit:- " +result);

    }
}
