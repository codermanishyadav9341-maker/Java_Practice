package AbstractionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
abstract class Bank {
   public abstract double getInterestRate();
}

class SBI extends Bank{
    private double interestRate;

    // Constructor
    public SBI(double interestRate){
        if(interestRate < 0){
            throw new IllegalArgumentException("InterestRate cannot be negative");
        }
         this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate(){
        return interestRate;
    }
}

class HDFC extends Bank{
    private double interestRate;

    // Constructor;
    public HDFC(double interestRate){
        if(interestRate < 0){
            throw new IllegalArgumentException("InterestRate cannot be negative");
        }
         this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate(){
        return interestRate;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter SBI Bank interestRate:- ");
            double interestRate = scan.nextDouble();

            System.out.print("Enter HDFC Bank interestRate:- ");
            double interestRateH = scan.nextDouble();

            Bank sb = new SBI(interestRate);
            Bank hdfc = new HDFC(interestRateH);

            System.out.println("SBI InterestRate:- " +sb.getInterestRate() +"%");
            System.out.println("HDFC InterestRate:- " +hdfc.getInterestRate() +"%");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter valid numberic value");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}