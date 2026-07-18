package EncapsulationPracticeSet;

public class Product {
    private int id;
    private double price;

    //Constructor;
    public Product(int id,double price){
        setId(id);
        setPrice(price);
    }

    // Getter && Setter;
    public void setId(int id){
        if(id <= 0){
            throw new IllegalArgumentException("Id must be positive");
        }
         this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price must be positive");
        }
         this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public static void main(String[] args){
        try{
            Product product = new Product(104,570);

            System.out.println("ID:- " +product.getId());
            System.out.println("Price:- " +product.getPrice());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
