package Polymorphism_PracticeSet;

public class DifferentType {
    public void print(int num){
        System.out.println("Integer:- " +num);
    }

    public void print(String str){
        System.out.println("String:- " +str);
    }

    public void print(double num){
        System.out.println("Double:- " +num);
    }

    public static void main(String[] args){
        DifferentType differentType = new DifferentType();
        differentType.print(100);
        differentType.print("Manish");
        differentType.print(100);
    }
}
