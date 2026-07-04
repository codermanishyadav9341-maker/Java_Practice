package Polymorphism_PracticeSet;

public class DifferentPara {
    public void print(int num){
        System.out.println("Integer values:- " +num);
    }

    public void print(String string){
        System.out.println("String:- " +string);
    }

    public void print(double num){
        System.out.println("Double values:- " +num);
    }

    public static void main(String[] args){
        DifferentPara differentPara = new DifferentPara();
        differentPara.print(10);
        differentPara.print("Manish Yadav");
        differentPara.print(10.5);

    }
}
