package Inheritance;

public class Animal {

    public void makeSound(){

    }
}

class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Dog2 barks");
    }

    public static void main(String[] args){
        Animal dd = new Dog();
        dd.makeSound();
    }
}
