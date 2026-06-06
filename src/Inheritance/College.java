package Inheritance;

public class College {
    String collegeName;

    College(String collegeName){
        this.collegeName = collegeName;
    }

    public void display(){
        System.out.println("College Name:- " +collegeName);
    }
}

class Admission extends College{
    String studentName;
    String course;

    Admission(String collegeName,String studentName,String course){
        super(collegeName);
        this.studentName = studentName;
        this.course = course;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Student Name:- " +studentName);
        System.out.println("Course:- " +course);
    }

    public static void main(String[] args){
        Admission am = new Admission("Smta College Jandha","Manish Yadav","BCA");
        am.display();
    }
}