package Inheritance_PracticeSet;

public class Vehicle {
    public void move(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
    public static void main(String[] args){
        Car car = new Car();
        car.move();
        car.start();
    }
}