package Inheritance_PracticeSet;


public class Shape {
    public void printShape(){
        System.out.println("Different shape");
    }
}
class Circle extends Shape{
    public void printArea(double radius){
        System.out.println("Area of circle:- " +Math.PI*radius*radius);
    }

    public static void main(String[] args){
        Circle cc = new Circle();
        cc.printArea(10);
    }
}