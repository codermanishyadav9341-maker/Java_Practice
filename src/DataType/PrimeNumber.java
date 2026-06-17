package DataType;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }
         else{
             for(int i = 2; i<num; i++){
                 if(num%i == 0){
                     isPrime = false;
                     break;
                 }
             }
        }

         if(isPrime){
             System.out.println("Prime number");
         }
          else{
              System.out.println("Not Prime number");
         }
    }
}
