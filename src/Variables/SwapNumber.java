package Variables;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter first number:- ");
            int a = scan.nextInt();

            System.out.print("Enter second number:- ");
            int b = scan.nextInt();

            System.out.println("============================Before Swap============================");
            System.out.println("a = " +a);
            System.out.println("b = " +b);

            System.out.println("=============================After Swap==============================");
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("a = " +a);
            System.out.println("b = " +b);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
