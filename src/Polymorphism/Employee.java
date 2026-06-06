package Polymorphism;

public class Employee {
    public double getBonus(){
        return 1000;
    }
}

class Manager extends Employee{

    @Override
    public double getBonus(){
        return 3000;
    }
}

class Developer extends Employee{

    @Override
    public double getBonus(){
        return 2000;
    }

    public static void main(String[] args){
        Employee ee = new Employee();
        Employee ma = new Manager();
        Employee de = new Developer();

        ee.getBonus();
        ma.getBonus();
        de.getBonus();

        System.out.println("Employee Bonus:- " +ee.getBonus());
        System.out.println("Manager Bonus:- " +ma.getBonus());
        System.out.println("Developer Bonus:- " +de.getBonus());

    }
}
