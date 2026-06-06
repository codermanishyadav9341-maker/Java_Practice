package Inheritance;

public class Device {
    String deviceName;

    Device(String deviceName){
        this.deviceName = deviceName;
    }

    public void showInfo(){
        System.out.println("Device Name:- " +deviceName);
    }
}

class Mobile extends Device{
    String os;

    Mobile(String deviceName,String os){
        super(deviceName);
        this.os = os;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("OS:- " +os);
    }

    public static void main(String[] args){
        Mobile mb = new Mobile("VIVO","Android");
        mb.showInfo();
    }
}