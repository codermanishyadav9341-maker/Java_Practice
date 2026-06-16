package Abstraction;

public interface Printer {
    abstract void print(String document);
}

class InjectPrinter implements Printer{

    @Override
    public void print(String document){
        System.out.println("Inject Printing........" +document);
    }
}
class LaserPrinter implements Printer{

    @Override
    public void print(String document){
        System.out.println("Laser Printing..........." +document);
    }

    public static void main(String[] args){
        Printer pp = new InjectPrinter();
        Printer pp1 = new LaserPrinter();

        pp.print("Hello Java");
        pp1.print("Hello Phython");

    }
}