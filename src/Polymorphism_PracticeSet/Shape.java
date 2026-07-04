package Polymorphism_PracticeSet;

public class Shape {
    public void draw(){
        System.out.println("Shape..........");
    }
}
class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Circle........");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle.......");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Triangle.......");
    }

    public static void main(String[] args){
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        shape.draw();
        circle.draw();
        rectangle.draw();
        triangle.draw();

    }
}