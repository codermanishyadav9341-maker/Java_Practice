package Array;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        int max = arr[0];

        System.out.println("Enter your Arrays elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i<size; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }

        System.out.println("Largest number is:- " +max);
    }
}
