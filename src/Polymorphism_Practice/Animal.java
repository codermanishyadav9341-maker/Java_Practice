package Polymorphism_Practice;

public class Animal {
    public void Sound(){
        System.out.println("Animal has Different  types of Sound");
    }
}

class Dog extends Animal{
    @Override
    public void Sound(){
        System.out.println("Dogs Barks");
    }

    public static void main(String[] args){
        Animal aa = new Animal();
        Animal a2 = new Dog();
        aa.Sound();
        a2.Sound();
    }
}