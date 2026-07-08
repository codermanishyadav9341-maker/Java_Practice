package Inheritance_PracticeSet;

public class Account {
    public void printAccount(){
        System.out.println("Different types of account");
    }
}
class SavingAccount extends Account{
    public void savingAccount(double amount){
        System.out.println("Saving Account:- " +amount);
    }

    public static void main(String[] args){
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.savingAccount(1000);
    }
}