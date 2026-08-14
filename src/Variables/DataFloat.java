package Variables;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DataFloat {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            float num = scan.nextFloat();

            System.out.println("Value of float:- " +num);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
