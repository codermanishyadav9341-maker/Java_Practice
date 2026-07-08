package Inheritance_PracticeSet;

public class Book {
    public void bookName(String bookname){
        System.out.println("Book:- " +bookname);
    }
}
class EBook extends Book{
    public void printFormat(String format){
        System.out.println("Format:- " +format);
    }

    public static void main(String[] args){
        EBook eBook = new EBook();
        eBook.bookName("Java");
        eBook.printFormat("PDF");
    }
}