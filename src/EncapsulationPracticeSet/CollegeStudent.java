package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CollegeStudent {
    private int roll;
    private String course;


    //Constructor;
    CollegeStudent(int roll,String course){
        setRoll(roll);
        setCourse(course);
    }

    //Getter && Setter;
    public void setRoll(int roll){
        if(roll <= 0){
            throw new IllegalArgumentException("Roll number must be positive");
        }
         this.roll = roll;
    }

    public int getRoll(){
        return roll;
    }

    public void setCourse(String course){
        if(course == null || course.trim().isEmpty()){
            throw new IllegalArgumentException("Course cannot be null or empty");
        }
         this.course = course;
    }

    public String getCourse(){
        return course;
    }

    @Override
    public String toString(){
        return "Roll number:- " +roll+
                "Course:- " +course;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Roll number:- ");
            int roll = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Course:- ");
            String course = scan.nextLine();

            CollegeStudent collegeStudent = new CollegeStudent(roll,course);
            System.out.println("---------------------------:Student Details:-------------------------------------");
            System.out.println(collegeStudent.toString());

        }
        catch (InputMismatchException e){
            System.out.println(" ");
        }
    }
}
