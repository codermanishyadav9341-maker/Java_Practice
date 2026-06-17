package DataTypeFloat;

import java.util.Scanner;
public class CubeRoot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        float num = scan.nextFloat();

        System.out.println("Cube Root:- " +Math.cbrt(num));
    }
}
