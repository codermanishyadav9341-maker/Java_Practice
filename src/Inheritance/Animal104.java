package Inheritance;

public class Animal104 {
    public void eat(){
        System.out.println("eating........");
    }
}
class Cat extends Animal104{

    public void sound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args){
        Cat cc2 = new Cat();
        cc2.eat();
        cc2.eat();
    }
}
