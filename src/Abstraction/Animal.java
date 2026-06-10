package Abstraction;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Dogs Barks");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}

class Cow extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Cow bha");
    }

    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}