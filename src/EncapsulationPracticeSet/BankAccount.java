package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class BankAccount {
    private double balance;

    //Constructor;
    public BankAccount(double balance){
        setBalance(balance);
    }

    //Setter
    public void setBalance(double balance){
        if(balance < 0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    //Getter
    public double getBalance(){
        return balance;
    }

    //deposit method
    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Deposit must be greater than 0");
        }

        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Update Balance:- " +balance);
    }

    //withDraw method
    public void withDraw(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("WithDraw must be greater than 1");
        }
         else{
             if(amount > balance){
                 System.out.println("Insufficient balance");
             }
             else{
                 balance -= amount;
                 System.out.println("Withdraw successful");
                 System.out.println("WithDraw amount:- " +balance);
             }
        }
    }
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Balance:- ");
            double balance  = scan.nextDouble();

            BankAccount bankAccount = new BankAccount(balance);
            System.out.println("\n1.Deposite");
            System.out.println("2.Withdraw");

            System.out.print("Choose number(1,2):- ");
            int choice = scan.nextInt();

            System.out.print("\nEnter amount:- ");
            double amount = scan.nextDouble();

            switch (choice){
                case 1:
                    bankAccount.deposit(amount);
                    break;

                case 2:
                    bankAccount.withDraw(amount);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid number");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
