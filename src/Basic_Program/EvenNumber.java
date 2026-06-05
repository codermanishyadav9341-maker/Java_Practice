package Basic_Program;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        String result = (num%2 == 0) ? "even number" : "Odd number";

        System.out.println(result);

        scan.close();
    }
}
