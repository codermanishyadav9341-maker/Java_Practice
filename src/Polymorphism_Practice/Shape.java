package Polymorphism_Practice;

public class Shape {
    public void area(int side){
        System.out.println("Area of Square:- " +side*side);
    }

    public void area(int length,int breadth){
        System.out.println("Area of Rectangle:- " +(length*breadth));
    }

    public void area(double radius){
        System.out.println("Area of Circle:- " +(Math.PI*radius*radius));
    }

    public static void main(String[] args){
        Shape sh = new Shape();
        sh.area(5);
        sh.area(10,5);
        sh.area(1.5);

    }
}
