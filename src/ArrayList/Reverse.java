package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class Reverse {
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

        //-------Reverse Elements--------
        System.out.print("\nReverse Elements:- ");
        for(int i = size-1; i>=0; i--){
         System.out.print(list.get(i) +" ");
        }
    }
}
