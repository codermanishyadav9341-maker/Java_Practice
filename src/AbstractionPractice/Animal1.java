package AbstractionPractice;

abstract class Animal1 {
    abstract void sound();
}
 class Dog1 extends Animal1{
    @Override
    public void sound(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args){
        Dog1 animal1 = new Dog1();
        animal1.sound();
    }
}