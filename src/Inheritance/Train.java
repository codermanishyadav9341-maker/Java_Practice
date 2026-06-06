package Inheritance;

public class Train {

    public void run(){
        System.out.println("Running........");
    }
}

class Metro extends Train{

    public void run(){
        System.out.println("Metro is running.........");
    }

    public static void main(String[] args){
        Metro mt = new Metro();
        mt.run();
    }
}