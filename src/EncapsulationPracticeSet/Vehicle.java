package EncapsulationPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Vehicle {
    private double speed;

    //Constructor;
    Vehicle(double speed){
        setSpeed(speed);
    }

    public void setSpeed(double speed){
        if(speed < 0){
            throw new IllegalArgumentException("Speed must be positive");
        }
         this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Speed:- ");
            double speed = scan.nextDouble();

            Vehicle vehicle = new Vehicle(speed);

            System.out.println("Speed:- " +vehicle.getSpeed()+"km/hr");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter integer number");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
