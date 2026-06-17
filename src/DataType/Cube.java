package DataType;

import java.util.Scanner;
public class Cube {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int side = scan.nextInt();

        System.out.println("Number of Cube:- " +(side*side*side));

        scan.close();
    }
}
