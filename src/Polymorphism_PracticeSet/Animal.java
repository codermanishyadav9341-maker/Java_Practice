package Polymorphism_PracticeSet;

public class Animal {
    public void sound(){
        System.out.println("Animal has different Sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog has different sound");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] main){
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.sound();
        dog.sound();
        cat.sound();

    }
}