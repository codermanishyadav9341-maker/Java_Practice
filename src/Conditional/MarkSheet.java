package Conditional;

import java.util.Scanner;
public class MarkSheet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student name:- ");
        String name = scan.nextLine();

        System.out.print("Enter your Marks:- ");
        double marks = scan.nextDouble();

        System.out.println("Student Name:- " +name);
        if(marks >= 85){
            System.out.println("Grade A");
        }
         else if(marks >= 65){
             System.out.println("Grade B");
        }
          else if(marks >= 45){
              System.out.println("Grade C");
        }
           else{
               System.out.println("fail");
        }
    }
}
