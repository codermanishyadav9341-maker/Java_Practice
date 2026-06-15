package Array;

import java.util.Scanner;
public class Empty {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        if(arr.length == 0){
            System.out.println("Array is empty");
        }
         else{
             System.out.println("Array is not empty");
        }

    }
}
