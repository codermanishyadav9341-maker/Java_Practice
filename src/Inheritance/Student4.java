package Inheritance;

public class Student4 {
    String name;

    Student4(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Student Name:- " +name);
    }
}

class MarkSheet extends Student4{
    double maths;
    double science;
    double english;

    MarkSheet(String name,double maths,double science,double english){
        super(name);
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Total Marks:- " +(maths+science+english));

    }

    public static void main(String[] args){
        MarkSheet mr = new MarkSheet("Manish Yadav",75,89,96);
        mr.display();
    }
}
