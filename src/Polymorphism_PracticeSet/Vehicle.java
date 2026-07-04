package Polymorphism_PracticeSet;

public class Vehicle {
    public void start(){
        System.out.println("Vehicle start with pad");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car start with self");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike start with kick");
    }
}
class Bus extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bus start with self");
    }

    public static void main(String[] args){
       Vehicle[] vehicle = {
               new Vehicle(),
               new Car(),
               new Bike(),
               new Bus()
       };

       for(Vehicle vehicle1 : vehicle){
           vehicle1.start();
       }

    }
}