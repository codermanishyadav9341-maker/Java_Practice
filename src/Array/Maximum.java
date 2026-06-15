package Array;

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        int max = arr[0];

        for(int i = 0; i<size; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }

        System.out.println("Maximum number is:- " +max);
    }
}
