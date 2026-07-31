package AbstractionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
abstract class Shape {
    public abstract void calculateArea();
}
class Circle extends Shape{
   private double radius;


    public Circle(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;

    }


    @Override
    public void calculateArea(){
        double areaCircle = Math.PI*radius*radius;

        System.out.println("Area of circle:- " +areaCircle);
    }

 static class Rectangle extends Shape{
        private double length;
        private double breadth;

        // Constructor;
        public Rectangle(double length,double breadth){
            if(length < 0){
                throw new IllegalArgumentException("Length cannot be negative");
            }
            this.length = length;

            if(breadth < 0){
               throw new IllegalArgumentException("Breadth cannot be negative");
            }
             this.breadth = breadth;
        }

        @Override
        public void calculateArea(){
            double area = length*breadth;
            System.out.println("Area of rectangle:- " +area);
        }
    }
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter Radius:- ");
            double radius = scan.nextDouble();

            Shape shape = new Circle(radius);
            shape.calculateArea();

            System.out.print("Enter length:- ");
            double length = scan.nextDouble();

            System.out.print("Enter breadth:- ");
            double breadth = scan.nextDouble();

            Shape rec = new Rectangle(length,breadth);
            rec.calculateArea();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid! Please enter valid numeric value");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}