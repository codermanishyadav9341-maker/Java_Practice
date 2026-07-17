package EncapsulationPracticeSet;

public class Book {
    private String title;
    private String author;

    //Constructor;
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title){
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
         this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        if(author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
         this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public static void main(String[] args){
        Book book = new Book("Java Programming","James Gosling");
        System.out.println("Title:- " +book.getTitle());
        System.out.println("Author:- " +book.getAuthor());
    }
}
