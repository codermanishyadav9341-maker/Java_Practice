package EncapsulationPracticeSet;

import java.util.Scanner;
public class BankingSystem {
    private double deposit;
    private double withdraw;

    //Constructor
    public BankingSystem(double deposit,double withdraw){
        setDeposit(deposit);
        setWithdraw(withdraw);
    }

    //use getter && setter;

    public void setDeposit(double deposit) {
        if (deposit < 0) {
            throw new IllegalArgumentException("Deposit cannot be negative");
        }
        this.deposit = deposit;
    }
    public double getDeposit(){
        return deposit;
    }

    public void setWithdraw(double withdraw){
        if(withdraw < 0){
            throw new IllegalArgumentException("Please check your balance");
        }
         if(withdraw > deposit){
             throw  new IllegalArgumentException("Insufficient balance");
         }
          this.deposit -= withdraw;
         System.out.println("WithDraw Successfully");
    }

    public double getWithdraw(){
        return withdraw;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter deposit amount:- ");
            double deposit = scan.nextDouble();

            System.out.print("Enter WithDraw amount:- ");
            double withdraw = scan.nextDouble();

            BankingSystem bankingSystem = new BankingSystem(deposit,withdraw);
            System.out.println("Available Balance:- " +bankingSystem.getDeposit());

        }
    }
}
