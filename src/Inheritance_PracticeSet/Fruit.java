package Inheritance_PracticeSet;

public class Fruit {
    public void print(){
        System.out.println("Fruit is healthy");
    }
}
class Apple extends Fruit{
    public void color(){
        System.out.println("Apple color is Red");
    }

    public static void main(String[] args){
        Apple apple = new Apple();
        apple.print();
        apple.color();
    }
}