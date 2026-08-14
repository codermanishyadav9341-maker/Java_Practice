package Variables;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DataINT {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Value of num:- " +num);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter integer value");
        }
    }
}
