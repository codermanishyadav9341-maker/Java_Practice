package Polymorphism_PracticeSet;

public class Fruit {
    public void color(){
        System.out.println("Fruit has different color");
    }
}
class Apple extends Fruit{
    @Override
    public void color(){
        System.out.println("Fruit color is Red");
    }
}
class Banana extends Fruit{
    @Override
    public void color(){
        System.out.println("Banana color is yellow");
    }
}
class Orange extends Fruit{
    @Override
    public void color(){
        System.out.println("Orange color is orange");
    }

    public static void main(String[] args){
        Fruit[] fruit = {
                new Apple(),
                new Banana(),
                new Orange()
        };

        for(Fruit fruit1: fruit){
            fruit1.color();
        }
    }
}