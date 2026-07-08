package Inheritance_PracticeSet;

public class Device {
    public void printDevice(){
        System.out.println("Device: Powered On");
    }
}
class Laptop extends Device{
    public void printMode(){
        System.out.println("Laptop Booted Successfully");
    }
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.printDevice();
        laptop.printMode();
    }
}