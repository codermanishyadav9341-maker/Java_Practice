package Abstraction;

abstract class Vehicle {
   abstract void start();
}

class Car extends Vehicle{

    @Override
    public void start(){
        System.out.println("Car Start with Self");
    }
}

class Bike extends Vehicle{

    @Override
    public void start(){
        System.out.println("Bike starts with Kick");
    }

    public static void main(String[] args){
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();

    }
}