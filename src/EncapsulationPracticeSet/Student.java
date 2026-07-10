package EncapsulationPracticeSet;

public class Student {
    private Long id;
    private String name;

    //Constructor
    public Student(Long id,String name){
       setId(id);
       setName(name);
    }
//    Getter && setter method usd;
    public void setId(Long id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("Invalid id");

        }
            this.id = id;

    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Student student = new Student(101L,"Manish Yadav");

        System.out.println("--------------------------------:Student Details:------------------------------------");
        System.out.println("Student ID:- " +student.getId());
        System.out.println("Name:- " +student.getName());
    }
}
