package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class SumElement {
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

        // sum of all elements:-
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum += list.get(i);
        }

        System.out.println("Sum of Array elements:- " +sum);
    }
}
