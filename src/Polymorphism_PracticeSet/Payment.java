package Polymorphism_PracticeSet;

public class Payment {
    public void pay(){
        System.out.println("Payments..........");
    }
}
class UPIPay extends Payment{
    @Override
    public void pay(){
        System.out.println("Payment Successful via card");
    }
}
class CardPay extends Payment{
    public void pay(){
        System.out.println("Card payment accepted");
    }
}
class Cash extends Payment{
    @Override
    public void pay(){
        System.out.println("Cash payment accepted");
    }
    public static void main(String[] args){
        Payment[] payment = {
                new Payment(),
                new UPIPay(),
                new CardPay(),
                new Cash()
        };

        for(Payment payment1 : payment){
            payment1.pay();
        }
    }
}