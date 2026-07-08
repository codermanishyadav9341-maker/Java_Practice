package Polymorphism_PracticeSet;

public class Food {
    public void taste(){
        System.out.println("Different type of food");
    }
}
class Pizza extends Food{
    @Override
    public void taste(){
        System.out.println("Pizza tastes cheesy");
    }
}
class Mango extends Food{
    @Override
    public void taste(){
        System.out.println("Mango tastes sweet");
    }
}
class Lemon extends Food{
    @Override
    public void taste(){
        System.out.println("Lemon taste sour");
    }

    public static void main(String[] args){
        Food[] food = {
                new Food(),
                new Pizza(),
                new Mango(),
                new Lemon()
        };

        for(Food food1 : food){
            food1.taste();
        }
    }
}
