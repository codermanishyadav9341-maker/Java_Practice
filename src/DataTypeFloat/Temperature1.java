package DataTypeFloat;

import java.util.Scanner;
public class Temperature1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Fahrenheit:- ");
        float fahrenheit = scan.nextFloat();

        float celsius = (5.0f/9.0f*(fahrenheit - 32));

        System.out.println("Celsius:- " +celsius);

    }
}
