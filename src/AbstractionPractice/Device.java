package AbstractionPractice;

abstract class Device {
    abstract void powerOn();
}
class Laptop extends Device{

    @Override
    public void powerOn(){
        System.out.println("Laptop powered On");
    }
}

class Mobile extends Device{

    @Override
    public void powerOn(){
        System.out.println("Mobile powered on");
    }

    public static void main(String[] args){
            Device laptop = new Laptop();
            Device mobile = new Mobile();

            laptop.powerOn();
            mobile.powerOn();



    }
}