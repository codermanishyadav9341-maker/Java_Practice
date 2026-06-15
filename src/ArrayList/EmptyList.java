package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class EmptyList {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter your ArrayList elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

       if(list.isEmpty()){
           System.out.println("List is empty");
       }
        else{
            System.out.println("List is not empty");
       }
    }
}
