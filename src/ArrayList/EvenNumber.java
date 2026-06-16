package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        ArrayList<Integer>  list = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(list.get(i) +" ");
        }
        //----Even number;
        System.out.print("\nEven number is:- ");
        for(int i = 0; i<size; i++){
            if(list.get(i)%2 == 0){
                System.out.print(list.get(i) +" ");
            }
        }
    }
}
