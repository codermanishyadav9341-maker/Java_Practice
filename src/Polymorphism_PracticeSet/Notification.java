package Polymorphism_PracticeSet;

public class Notification {
    public void send(){
        System.out.println("Notification");
    }
}
class Email extends Notification{
    @Override
    public void send(){
        System.out.println("Email sent successfully");
    }
}
class SMS extends Notification{
    @Override
    public void send(){
        System.out.println("SMS sent successfully");
    }
}
class PushNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Push Notification sent successfully");
    }
    public static void main(String[] args){
        Notification[] notification = {
                new Email(),
                new SMS(),
                new PushNotification()
        };

        for(Notification notification1: notification){
            notification1.send();
        }
    }
}