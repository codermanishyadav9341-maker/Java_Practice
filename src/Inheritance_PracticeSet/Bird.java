package Inheritance_PracticeSet;

public class Bird {
    public void fly(){
        System.out.println("Bird is flying");
    }
}
class Parrot extends Bird{
    public void sound(){
        System.out.println("Parrot is speaking");
    }

    public static void main(String[] args){
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.sound();
    }
}