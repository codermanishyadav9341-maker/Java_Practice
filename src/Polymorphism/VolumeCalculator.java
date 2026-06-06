package Polymorphism;

public class VolumeCalculator {
    public void volume(int side){
        System.out.println("Volume of Cube:- " +(side*side*side));
    }

    public void volume(int length,int breadth,int height){
        System.out.println("Volume of cuboid:- " +(length*breadth*height));
    }

    public void cylinder(double radius,int height){
        System.out.println("Volume of Cylinder:- " +(Math.PI*radius*radius*height));
    }

    public static void main(String[] args){
        VolumeCalculator vc = new VolumeCalculator();
        vc.volume(3);
        vc.volume(10,5,3);
        vc.cylinder(5.2,10);

    }
}

