package Inheritance_PracticeSet;

public class Vehicle1 {
    public void move(){
        System.out.println("Vehicle is moving");
    }
}
class Car1 extends Vehicle1{
    public void start(){
        System.out.println("Car started");
    }
}
class SportsCar extends Car1{
    public void run(){
        System.out.println("Sports car is running at high speed");
    }
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        sportsCar.move();
        sportsCar.start();
        sportsCar.run();
    }
}