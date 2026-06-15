package Array;

import java.util.Scanner;
public class Search {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        //----------------Searching elements--------------
        System.out.print("Searching elements:- ");
        int key = scan.nextInt();

        boolean found = false;

        for(int i = 0; i<size; i++){
            if(arr[i] == key){
                System.out.println("Elements Present in Index no:- " +i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Elements is not Present in this Arrays");
        }
    }
}
