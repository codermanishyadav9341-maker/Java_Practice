package EncapsulationPracticeSet;

public class Person {
    private String name;
    private int age;

    //Constructor;
    public Person(String name,int age){
      setName(name);
      setAge(age);
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        try{
            Person person = new Person("Manish Yadav",23);

            System.out.println("Name:- " +person.getName());
            System.out.println("Age:- " +person.getAge());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
