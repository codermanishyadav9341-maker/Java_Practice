package Inheritance;

public class Account {
      double balance;

      Account(double balance){
          this.balance = balance;
      }

      public void showBalance(){
          System.out.println("Balance:- " +balance);
      }
}

class SavingAccount extends Account{
    double interestRate;

    SavingAccount(double balance,double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void showBalance(){
        double interest = (balance*interestRate)/100;
        double totalBalance = balance+interest;
        super.showBalance();
        System.out.println("InterestRate:- " +interestRate);
        System.out.println("Balance with InterestRate:- " +totalBalance);
    }

    public static void main(String[] args){
        SavingAccount sa = new SavingAccount(5000,0.005);
        sa.showBalance();
    }
}
