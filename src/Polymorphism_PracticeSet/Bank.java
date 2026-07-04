package Polymorphism_PracticeSet;

public class Bank {
    public double getInterestRate(){
        return 7.0;
    }
}
class SBI extends Bank{
    @Override
    public double getInterestRate(){
       return 6.5;
    }
}
class HDFC extends Bank{
    @Override
    public double getInterestRate(){
        return 7.0;
    }
}
class ICICI extends Bank{
    @Override
    public double getInterestRate(){
        return 6.8;
    }
}
class UPI extends Bank{
    @Override
    public double getInterestRate(){
        return 0.0;
    }
    public static void main(String[] args){
        Bank bank = new Bank();
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();
        Bank upi = new UPI();

        System.out.println(":----------------------------------Bank Interest Rate:--------------------------------");
        System.out.println("Bank Interest:- " +bank.getInterestRate());
        System.out.println("SBI InterestRate:- " +sbi.getInterestRate());
        System.out.println("HDFC InterestRate:- " +hdfc.getInterestRate());
        System.out.println("ICICI InterestRate:- " +icici.getInterestRate());
        System.out.println("UPI:- "  +upi.getInterestRate());

    }
}