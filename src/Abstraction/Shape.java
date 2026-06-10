package Abstraction;

abstract class Shape {
    String name;

    Shape(String name){    // Constructor;
        this.name = name;
    }

    abstract double area();

    public String toString(){
        return "Shape:- " +name+ "Area:- " +area();
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        super(" of Circle ");
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        super(" of Rectangle  ");
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length*breadth;
    }

    public static void main(String[] args){
        Shape s1 = new Circle(10);
        Shape s2 = new Rectangle(10,5);

        s1.area();
        s2.area();

        System.out.println(s1);
        System.out.println(s2);

    }
}