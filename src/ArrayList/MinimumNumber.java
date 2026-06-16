package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class MinimumNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        if(size <= 0){
            System.out.println("Array is empty");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(list.get(i) +" ");
        }

        //---Minimum number;
        int min = list.get(0);

        for(int i = 0; i<size; i++){
            if(list.get(i) <= min){
                min = list.get(i);
            }
        }

        System.out.println("\nMinimum number is:- " +min);
    }
}
