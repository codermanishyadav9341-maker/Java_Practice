package Polymorphism_PracticeSet;

public class Bird {
    public void fly(){
        System.out.println("Different types of birds");
    }
}
class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle flies very high");
    }
}
class Sparrow extends Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow flies fast");
    }
}
class Penguin extends Bird{
    @Override
    public void fly(){
        System.out.println("Penguin cannot fly");
    }

    public static void main(String[] args){
        Bird[] bird = {
                new Eagle(),
                new Sparrow(),
                new Penguin()
        };

        for(Bird bird1 : bird){
            bird1.fly();
        }
    }
}