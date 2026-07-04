package Polymorphism_PracticeSet;

public class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }

    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public double add(double num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args){
       Calculator addNumber = new Calculator();

        System.out.println("Sum two integer number:- " +addNumber.add(10,20));
        System.out.println("Sum three integer number:- " +addNumber.add(10,20,30));
        System.out.println("Sum two double number:- " +addNumber.add(10.5,5));
    }
}
