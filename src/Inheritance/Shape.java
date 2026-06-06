package Inheritance;

public class Shape {
    public void area(){
        System.out.println("Calculating area........");
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area of Rectangle:- " +(length*breadth));
    }

    public static void main(String[] args){
        Rectangle rr1 = new Rectangle(10,5);
        rr1.area();
    }
}