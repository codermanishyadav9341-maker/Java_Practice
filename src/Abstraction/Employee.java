package Abstraction;

abstract class Employee {
    String name;

    public Employee(String name){
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
    double salary;

    public FullTimeEmployee(String name,double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public void calculateSalary(){
        System.out.println(name+ " = " +salary);
    }
}

class PartTimeEmployee extends Employee{
    double salary;

    public PartTimeEmployee(String name,double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public void calculateSalary(){
        System.out.println(name+ " = " +salary);
    }

    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee("Manish Yadav",50000);
        Employee e2 = new PartTimeEmployee("Ronit Raj",4000);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}