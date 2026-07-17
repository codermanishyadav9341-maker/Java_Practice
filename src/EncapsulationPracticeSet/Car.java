package EncapsulationPracticeSet;

public class Car {
    private String brand;
    private String model;

    //Constructor;
    public Car(String brand,String model){
        this.brand = brand;
        this.model = model;
    }

   public void setBrand(String brand){
        if(brand == null || brand.trim().isEmpty()){
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
       this.brand = brand;
   }

   public String getBrand(){
        return brand;
   }

   public void setModel(String model){
        if(model == null || model.trim().isEmpty()){
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
         this.model = model;
   }

   public String getModel(){
        return model;
   }

   public static void main(String[] args){
        Car car = new Car("TATA","NEXON");

        System.out.println("Brand:- " +car.getBrand());
        System.out.println("Model:- " +car.getModel());


   }

}
