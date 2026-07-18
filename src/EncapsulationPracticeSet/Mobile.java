package EncapsulationPracticeSet;

public class Mobile {
    private String company;
    private double price;

    //Constructor;
     Mobile(String company,double price){
        setCompany(company);
        setPrice(price);
    }

    //Getter && Setter;
    public void setCompany(String company){
        if(company == null || company.trim().isEmpty()){
            throw new IllegalArgumentException("Company cannot be null or empty");
        }
          this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        }
         else{
             throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public double getPrice(){
        return price;
    }

    public static void main(String[] args){
       try{
           Mobile  mobile = new Mobile("SAMSUNG",25000);

           System.out.println("Company Name:- " +mobile.getCompany());
           System.out.println("Price:- " +mobile.getPrice());
       }
       catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
    }
}
