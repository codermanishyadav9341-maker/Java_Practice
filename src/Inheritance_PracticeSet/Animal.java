package Inheritance_PracticeSet;

public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args){
        Dog dd = new Dog();
        dd.eat();
        dd.sound();

    }
}