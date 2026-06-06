package Inheritance;

public class Parent {

    Parent(){
        System.out.println("Parents Constructor Called");
    }
}

class Student1 extends Parent{

    Student1(){
        System.out.println("Child Constructor Called");
    }

    public static void main(String[] args){
        Student1 s1 = new Student1();

    }
}
