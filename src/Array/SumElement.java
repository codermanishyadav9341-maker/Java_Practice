package Array;

import java.util.Scanner;
public class SumElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        int sum = 0;

        for(int i = 0; i<size; i++){
            sum += arr[i];
        }

        System.out.println("Sum of Array elements are:- " +sum);

        scan.close();
    }
}
