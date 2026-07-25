package EncapsulationPracticeSet;

import java.util.Scanner;
public class LibraryBook {
    private int id;
    private String title;
    private String author;

    //Constructor;
    public LibraryBook(int id,String title,String author){
        setId(id);
        setTitle(title);
        setAuthor(author);
    }

    //Getter && Setter;
    public void setId(int id){
        if(id <= 0){
            throw new IllegalArgumentException("Id must be positive");
        }
         this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String title){
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("title cannot be null or empty");
        }
         this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot null or empty");
        }
         this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "Book Id:- " +id+
                "\nTitle:- " +title+
                "\nAuthor:- " +author;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Book Id:- ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Title:- ");
            String title = scan.nextLine();

            System.out.print("Enter Author:- ");
            String author = scan.nextLine();

            LibraryBook libraryBook = new LibraryBook(id,title,author);
            System.out.println("----------------------------:Book Information:---------------------------------");
            System.out.println(libraryBook.toString());

        }
    }
}
