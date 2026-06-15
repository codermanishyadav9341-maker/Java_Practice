package Array;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        //---------Second largest Smallest digits;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<size; i++){
            if(smallest >= arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            }
             else if(secondSmallest >= arr[i] && smallest != arr[i]){
                 secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest Digits:- " +smallest);
        System.out.println("SecondSmallest Digits:- " +secondSmallest);
    }
}
