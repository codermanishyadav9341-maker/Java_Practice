package Polymorphism_PracticeSet;

public class DifferentShape {
    public void calculateArea(double radius){
        System.out.println("Circle radius:- " +radius);
    }

    public void calculateArea(int length,int breadth){
        System.out.println("Area of rectangle:- " +(length*breadth));
    }

    public void calculateArea(int side){
        System.out.println("Area of square:- " +(side*side));
    }

    public static void main(String[] args){
        DifferentShape differentShape = new DifferentShape();
        differentShape.calculateArea(10.5);
        differentShape.calculateArea(10,5);
        differentShape.calculateArea(10);
    }
}
