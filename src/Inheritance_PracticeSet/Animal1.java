package Inheritance_PracticeSet;

public class Animal1 {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal1{
    public void sound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args){
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}