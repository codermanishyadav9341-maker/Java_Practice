package Polymorphism_PracticeSet;

public class AddNumber {
    public void add(int num1,int num2){
        System.out.println("Sum of two number is:- " +(Math.addExact(num1,num2)));
    }

    public void add(int num1,int num2,int num3){
        System.out.println("Sum of three Integer number:- " +(num1+num2+num3));
    }

    public static void main(String[] args){
        AddNumber addNumber = new AddNumber();
        addNumber.add(10,20);
        addNumber.add(10,20,30);
    }
}
