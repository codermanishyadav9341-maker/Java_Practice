package Array;

import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<size; i++){
               if(arr[i] > largest){
                   secondLargest = largest;
                   largest = arr[i];
               }
                else if(arr[i] >= secondLargest && arr[i] != largest){
                       secondLargest = arr[i];
               }
        }

        System.out.println("Largest number:- " +largest);
        System.out.println("Second Largest number:- " +secondLargest);


    }
}
