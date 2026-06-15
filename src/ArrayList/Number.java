package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }

        System.out.print("ArrayList elements:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}