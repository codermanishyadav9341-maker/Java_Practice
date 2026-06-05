package Basic_Program;

import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Characters:- ");
        char ch1 = scan.next().charAt(0);

        System.out.print("Enter Last Characters:- ");
        char ch2 = scan.next().charAt(0);

        if(ch1 <= ch2){
            for(char ch = ch1; ch<=ch2; ch++){
                System.out.println(ch+ " = " +(int) ch);
            }

        }
    }
}
