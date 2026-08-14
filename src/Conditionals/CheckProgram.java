package Conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckProgram {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Cost Price:- ");
            double cost = scan.nextDouble();

            System.out.print("Enter Selling Price:- ");
            double selling = scan.nextDouble();

            double profit;
            double loss;
            if(selling >= cost){
                profit = selling-cost;
                System.out.println("Profit:- " +profit);
            }
             else if(cost > selling){
                 loss = cost-selling;
                 System.out.println("Loss:- " +loss);
            }
             else{
                 System.out.println("Profit and loss are equal");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter valid numeric value");
        }
    }
}
