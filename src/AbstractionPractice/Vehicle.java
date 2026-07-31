package AbstractionPractice;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike start successfully");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike start successfully");
    }

    public static void main(String[] args){
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        vehicle1.start();
        vehicle2.start();
    }
}