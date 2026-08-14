package AbstractionPractice;

abstract class Food {
    abstract void taste();
}

class Pizza extends Food{
    @Override
    public void taste(){
        System.out.println("Pizza taste Cheesy");
    }
}
class Mango extends Food{
    @Override
    public void taste(){
        System.out.println("Mango taste sweet");
    }

    public static void main(String[] args){
        Food pizza = new Pizza();
        Food mango = new Mango();
        pizza.taste();
        mango.taste();
    }
}