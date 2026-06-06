package Polymorphism;

public class Vehicle {
    public void displayInfo(){
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle{

    @Override
    public void displayInfo(){
        System.out.println("Car: 4 wheels");
    }
}

class Bike extends Vehicle{

    @Override
    public void displayInfo(){
        System.out.println("Bike : 2 wheels");
    }

    public static void main(String[] args){
        Vehicle vv = new Vehicle();
        Car cc = new Car();
        Bike bb = new Bike();

        vv.displayInfo();
        cc.displayInfo();
        bb.displayInfo();

    }
}