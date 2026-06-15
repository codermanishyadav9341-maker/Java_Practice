package Array;

import java.util.Scanner;
public class IndexNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter Index no:- ");
        int index = scan.nextInt();

            if (index >= 0 && index < size) {
                System.out.println("Elements Present is:- " +arr[index]);

            }
             else{
                 System.out.println("Elements not Present");
            }

    }
}
