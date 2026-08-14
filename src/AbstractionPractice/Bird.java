package AbstractionPractice;

abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle flies high");
    }
}
class Penguin extends Bird{
    @Override
    public void fly(){
        System.out.println("Penguin cannot fly");
    }

    public static void main(String[] args){
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();
        penguin.fly();
    }
}