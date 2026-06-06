package Inheritance;

public class LivingBeing {
    public void breath(){
        System.out.println("Breathing......");
    }
}

class Animal10 extends LivingBeing{

    public void eat(){
        System.out.println("eating....");
    }
}

class Dog3 extends LivingBeing{

    public void bark(){
        System.out.println("Barking......");
    }

    public static void main(String[] args){
        LivingBeing lb = new LivingBeing();
        Animal10 a4 = new Animal10();
        Dog3 d4 = new Dog3();
        lb.breath();
        a4.eat();
        d4.bark();

    }
}