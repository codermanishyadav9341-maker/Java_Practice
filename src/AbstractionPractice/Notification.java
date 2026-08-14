package AbstractionPractice;

abstract class Notification {
    abstract void send();
}

class Email extends Notification{
    @Override
    public void send(){
        System.out.println("Email sent Successfully");
    }
}

class SMS extends Notification{

    @Override
    public void send(){
        System.out.println("SMS sent Successfully");
    }

    public static void main(String[] args){
        Notification email = new Email();
        Notification sms = new SMS();

        email.send();
        sms.send();
    }
}