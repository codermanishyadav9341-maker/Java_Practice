package Polymorphism_PracticeSet;

public class Device {
    public void powerOn(){
        System.out.println("Different types of device");
    }
}
class Laptop extends Device{
    @Override
    public void powerOn(){
        System.out.println("Laptop is powering on");
    }
}
class Mobile extends Device{
    @Override
    public void powerOn(){
        System.out.println("Mobile is powering on");
    }
}
class TV extends Device{
    @Override
    public void powerOn(){
        System.out.println("TV is powering on");
    }

    public static void main(String[] args){
        Device[] device = {
                new Laptop(),
                new Mobile(),
                new TV()
        };

        for(Device device1: device){
            device1.powerOn();
        }
    }
}