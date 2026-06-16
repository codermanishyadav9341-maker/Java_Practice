package Polymorphism_Practice;

public class Sum {
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args){
        Sum ss = new Sum();

        System.out.println("Integer Sum of two number is:- " +ss.add(10,20));
        System.out.println("Integer Sum of three number is:- " +ss.add(10,20,30));
        System.out.println("Double Sum of two number is:- " +ss.add(10,2.5));


    }
}
