package Variables;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckEvenNumber {
      public static void main(String[] args){
          try(Scanner scan = new Scanner(System.in)){

              System.out.print("Enter number:- ");
              int num = scan.nextInt();

              String result = (num%2 == 0) ? "Even number" : "Odd number";

              System.out.println(num+ " is " +result);
          }
          catch (InputMismatchException e){
              System.out.println("Invalid input! Please enter valid numeric value");
          }
      }
}
