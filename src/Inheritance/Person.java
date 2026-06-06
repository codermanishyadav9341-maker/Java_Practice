package Inheritance;

public class Person {
    public void showDetails(){
        System.out.println("Person Details");
    }
}

class Student extends Person{

    @Override
    public void showDetails(){
        System.out.println("Student3 details");
    }

    public static void main(String[] args){
        Student ss = new Student();
        ss.showDetails();

    }
}
