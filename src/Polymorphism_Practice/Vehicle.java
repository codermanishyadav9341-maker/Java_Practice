package Polymorphism_Practice;

public class Vehicle {
    public void start(){
        System.out.println("Vehicle is running on Paydil");
    }
}
class Car extends Vehicle{

    @Override
    public void start(){
        System.out.println("Car: 4 wheels");
    }

    public static void main(String[] args){
        Vehicle vv = new Car();
        vv.start();
    }
}
