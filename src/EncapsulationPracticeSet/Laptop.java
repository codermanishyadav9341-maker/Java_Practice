package EncapsulationPracticeSet;

public class Laptop {
    private int ram;
    private  int storage;

    //Constructor;
    public Laptop(int ram,int storage){
        setRam(ram);
        setStorage(storage);
    }

    //Getter && Setter;
    public void setRam(int ram){
        if(ram < 0){
            throw new IllegalArgumentException("Ram cannot be negative");
        }
        this.ram = ram;
    }

    public int getRam(){
        return ram;
    }

    public void setStorage(int storage){
        if(storage < 0){
            throw new IllegalArgumentException("Storage cannot be negative");
        }
         this.storage = storage;
    }

    public int getStorage(){
        return storage;
    }

    public static void main(String[] args){
        try{
            Laptop laptop = new Laptop(512,602);

            System.out.println("RAM:- " +laptop.getRam());
            System.out.println("STORAGE:- " +laptop.getStorage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
