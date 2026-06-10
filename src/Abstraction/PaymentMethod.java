package Abstraction;

public interface PaymentMethod {
    public void pay(double amount);
}

class CreditCard implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("CreditCard:- " +amount);
    }
}

class UPI implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("UPI payments:- " +amount);
    }
}

class Cash implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("Cash Payments:- " +amount);
    }

    public static void main(String[] args){
        PaymentMethod pp = new CreditCard();
        PaymentMethod pp1 = new UPI();
        PaymentMethod pp2 = new Cash();

        pp.pay(1000);
        pp1.pay(5000);
        pp2.pay(5000);
    }
}
