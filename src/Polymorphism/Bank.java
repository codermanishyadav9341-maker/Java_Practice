package Polymorphism;

public class Bank {
    public int getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{

    @Override
    public int getInterestRate(){
        return 5;
    }
}

class HDFC extends Bank{

    @Override
    public int getInterestRate(){
        return 6;
    }
}

class ICICI extends Bank{

    @Override
    public int getInterestRate(){
        return 7;
    }

    public static void main(String[] args){
        SBI sb = new SBI();
        HDFC hd = new HDFC();
        ICICI ic = new ICICI();

        System.out.println("SBI Interest Rate:- " +sb.getInterestRate()+ "%");
        System.out.println("HDFC Interest Rate:- " +hd.getInterestRate()+ "%");
        System.out.println("ICICI Interest Rate:- " +ic.getInterestRate()+ "%");


    }
}