package Inheritance;

public class Course {
    String course_name;

    Course(String course_name){
        this.course_name = course_name;
    }

    public void showCourse(){
        System.out.println("Course Name:- " +course_name);
    }
}

class EnrolledStudent extends Course{
    String student_name;
    int rollNumber;

    EnrolledStudent(String course_name,String student_name,int rollNumber){
        super(course_name);
        this.student_name = student_name;
        this.rollNumber = rollNumber;
    }

    @Override
    public void showCourse(){
        super.showCourse();
        System.out.println("Student Name:- " +student_name);
        System.out.println("Roll Number:- " +rollNumber);
    }

    public static void main(String[] args){
        EnrolledStudent ed = new EnrolledStudent("Java Programming","Manish Yadav",101);
        ed.showCourse();

    }
}
