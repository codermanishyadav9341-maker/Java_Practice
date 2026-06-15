package Array;

import java.util.Scanner;

public class MergeTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Array Size:- ");
        int size1 = scan.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter your first Array elements:- ");
        for(int i = 0; i<size1; i++){
            arr1[i] = scan.nextInt();
        }

        // First Array
        System.out.print("First Array elements:- ");
        for(int i = 0; i<size1; i++){
            System.out.print(arr1[i] + " ");
        }

        //Second Array size;
        System.out.print("\nEnter Second Array Size:- ");
        int size2 = scan.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter your Second Array elements:- ");
        for(int i = 0; i<size2; i++){
            arr2[i] = scan.nextInt();
        }

        //Second Array
        System.out.print("Second Array elements:- ");
        for(int i = 0; i<size2; i++){
            System.out.print(arr2[i] + " ");
        }

        // marge array
        int[] merged = new int[size1 + size2];

        // first Array copy;
        for(int i = 0; i<size1; i++){
            merged[i] = arr1[i];
        }

        //Second Array copy;
        for(int i = 0; i<size2; i++){
            merged[size1 + i] = arr2[i];
        }

        // merged Array
        System.out.print("\nMerged Array:- ");
        for(int i = 0; i<merged.length; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
