package AbstractionPractice;

abstract class Animal {
   abstract void sound();
}

class Result1 extends Animal{

    @Override
    public void sound(){
        System.out.println("Different animal has different sound");
    }

    public static void main(String[] args){
        Animal animal = new Result1();
        animal.sound();
    }

}