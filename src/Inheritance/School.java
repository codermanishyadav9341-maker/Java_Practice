package Inheritance;

public class School {
    String schoolName;

    School(String schoolName){
        this.schoolName = schoolName;
    }

    public void showSchool(){
        System.out.println("School Name:- " +schoolName);
    }
}

class Teacher extends School{
    String teacherName;

    Teacher(String schoolName,String teacherName){
        super(schoolName);
        this.teacherName = teacherName;
    }

    @Override
    public void showSchool(){
        super.showSchool();
        System.out.println("Teacher Name:- " +teacherName);
    }

    public static void main(String[] args){
        School sc = new Teacher("Coding Age","Gaurav");
        sc.showSchool();
    }
}
