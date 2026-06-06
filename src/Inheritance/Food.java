package Inheritance;

public class Food {
    String foodName;

    Food(String foodName){
        this.foodName = foodName;
    }

    public void display(){
        System.out.println("Food Name:- " +foodName);
    }
}

class Desert extends Food{
    String sweetness;

    Desert(String foodName,String sweetness){
        super(foodName);
        this.sweetness = sweetness;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Sweetness Level:- " +sweetness);
    }

    public static void main(String[] args){
        Desert ds = new Desert("Gulab Jamun","High");
        ds.display();
    }
}