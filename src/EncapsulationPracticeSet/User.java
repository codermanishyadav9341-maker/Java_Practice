package EncapsulationPracticeSet;

import java.util.Scanner;
public class User {
    private String username;
    private String password;

    //constructor;
    User(String username,String password){
        setUsername(username);
        setPassword(password);
    }

    //Use only getter && Setter;

    public void setUsername(String username){
        if(username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
         this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        if(password == null || password.length() < 8){
            throw new IllegalArgumentException("Password cannot be null");
        }
         this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Username:- ");
            String username = scan.nextLine();

            System.out.print("Enter Password:- ");
            String password = scan.nextLine();

            User user = new User(username,password);

            System.out.println("Username:- " +user.getUsername());
            System.out.println("Password:- " +user.getPassword());

        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
