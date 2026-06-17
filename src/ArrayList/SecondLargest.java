package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class SecondLargest {
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

        // Second Largest
        int largest = Integer.MAX_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int i = 0; i<size; i++){
            if(list.get(i) >= largest){
                secondLargest = largest;
                largest = list.get(i);
            }
             else if(list.get(i) >= secondLargest && largest != list.get(i));
             secondLargest = list.get(i);
        }

        System.out.println("Largest elements:- " +largest);
        System.out.println("SecondLargest elements:- " +secondLargest);

    }
}
