package Inheritance;

public class Shape104 {
    public void perimeters(){
        System.out.println("Calculating..........");
    }
}
class Square104 extends Shape104{
    double side;

    Square104(double side){
        this.side = side;
    }

    @Override
    public void perimeters(){
        System.out.println("Perimeters of Square:- " +(4*side));
    }

    public static void main(String[] args){
        Square104 s104 = new Square104(10);
        s104.perimeters();

    }
}
