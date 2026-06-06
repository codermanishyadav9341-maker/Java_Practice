package Polymorphism;

public class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }

    public void draw(int radius){
        System.out.println("Drawing circle with radius is:- " +radius);
    }
}

class Rectangle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing rectangle");
    }

    public static void main(String[] args){
        Shape sp = new Shape();
        Circle c1 = new Circle();
        Shape r1 = new Rectangle();

        sp.draw();
        c1.draw();
        c1.draw(10);
        r1.draw();

    }
}