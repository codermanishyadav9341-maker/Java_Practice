package Polymorphism;

import java.util.Scanner;
public class Calculator {
   public int add(int a,int b){
       return a+b;
   }

   public int add(int a,int b,int c){
       return a+b+c;
   }

   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       Calculator cc = new Calculator();

       System.out.print("Enter your first number:- ");
       int a = scan.nextInt();

       System.out.print("Enter your Second number:- ");
       int b = scan.nextInt();

       System.out.print("Enter your thirds number:- ");
       int c = scan.nextInt();

       System.out.println("Sum of two number is:- " +cc.add(a,b));
       System.out.println("Sum of three number is:- " +cc.add(a,b,c));

       scan.close();
   }
}
