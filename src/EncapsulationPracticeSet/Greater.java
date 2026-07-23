package EncapsulationPracticeSet;

public class Greater {
    private int age;

    public Greater(int age){
       setAge(age);
    }

    public void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age must be positive");
        }
         this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        try{
            Greater greater = new Greater(20);

            System.out.println("Age set successfully:- " +greater.getAge());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
