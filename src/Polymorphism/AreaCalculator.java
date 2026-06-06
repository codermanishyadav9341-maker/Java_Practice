package Polymorphism;

public class AreaCalculator {
    public double area(int radius){
        return Math.PI*radius*radius;
    }

    public int area(int length ,int breadth){
        return length*breadth;
    }

    public double area(double base , int height){
        return 0.5*base*height;
    }

    public static void main(String[] args){
        AreaCalculator rr = new AreaCalculator();

        System.out.println("Area of Circle:- " +rr.area(10));
        System.out.println("Area of Rectangle:- " +rr.area(10,5));
        System.out.println("Area of triangle:- " +rr.area(1.5,5));

    }
}
