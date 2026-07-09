package Inheritance_PracticeSet;

public class Animal2 {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal2{
    public void birth(){
        System.out.println("Mammal gives birth to young ones");
    }
}
class Dog1 extends Mammal{
    public void sound1(){
        System.out.println("Dog is barking");
    }
    public static void main(String[] args){
        Dog1 dog1 = new Dog1();
        dog1.eat();
        dog1.birth();
        dog1.sound1();
    }
}