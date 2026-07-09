package Inheritance_PracticeSet;

public class Parent {
    public void parent(){
        System.out.println("Parent method executed successfully");
    }
}
class Child extends Parent{
    public void child(){
        System.out.print("Child method executed successfully");
    }

    public static void main(String[] args){
        Child child = new Child();
        child.parent();
    }
}