package Inheritance;

public class BankAccount {
    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println("Initial Balance:- " +balance);

    }
}

class SavingAccount2 extends BankAccount{
    double amount;

    SavingAccount2(double balance,double amount){
        super(balance);
        this.amount = amount;
    }

    public void deposit(){
        double updateBalance = balance+amount;
        super.displayBalance();
        System.out.println("Deposit Balance:- " +amount);
        System.out.println("New Balance:- " +updateBalance);
    }

    public static void main(String[] args){
        SavingAccount2 s2 = new SavingAccount2(5000,1000);
            s2.deposit();
    }
}