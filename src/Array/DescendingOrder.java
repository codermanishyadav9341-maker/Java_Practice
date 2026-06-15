package Array;

import java.util.Scanner;
public class DescendingOrder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        // -----------------------Descending Order-------------------------------
        System.out.print("Descending Order:- ");
        for(int i = 0; i<size-1; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i] <arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
