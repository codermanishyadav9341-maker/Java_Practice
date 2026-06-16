package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class SearchElement {
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

        // ------Search elements;
        System.out.print("Search elements:- ");
        int key = scan.nextInt();

        boolean found = false;
        for(int i = 0; i<size; i++){
            if(list.get(i) == key){
                System.out.print("Elements found at index:- " +i);
                found = true;
                break;
            }
        }


    }
}
