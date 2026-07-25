package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HospitalPatient {
    private int id;
    private String name;
    private String disease;

    //Constructor;
    public HospitalPatient(int id, String name,String disease){
        setId(id);
        setName(name);
        setDisease(disease);
    }

    //Getter && Setter
    public void setId(int id){
        if(id <= 0){
            throw new IllegalArgumentException("Id must be positive");
        }
         this.id = id;
    }

    public int getId(){
        return id;
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

    public void setDisease(String disease){
        if(disease == null || disease.trim().isEmpty()){
            throw new IllegalArgumentException("Disease cannot be null or empty");
        }
         this.disease = disease;
    }

    public String getDisease(){
        return disease;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Patient Id:- ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Patient name:- ");
            String name = scan.nextLine();


            System.out.print("Enter Disease:- ");
            String disease = scan.nextLine();

            HospitalPatient hospitalPatient = new HospitalPatient(id,name,disease);

            System.out.println("---------------------------------:Patient Details:----------------------------");
            System.out.println("Patient Id:- " +hospitalPatient.getId());
            System.out.println("Name:- " +hospitalPatient.getName());
            System.out.println("Disease:- " +hospitalPatient.getDisease());

        }
        catch (InputMismatchException e){
            System.out.println("Patient Id must be Integer");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
