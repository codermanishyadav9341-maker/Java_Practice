package Inheritance_PracticeSet;

public class Book1 {
    public void book(){
        System.out.println("Book: Sherlock HolmesCategory");
    }
}
class Novel extends Book1{
    public void novel(){
        System.out.println("HomesCategory");
    }
}
class MysteryNovel extends Novel{
    public void print(){
        System.out.println("NovelGenre: Mystery");
    }

    public static void main(String[] args){
        MysteryNovel mysteryNovel = new MysteryNovel();
        mysteryNovel.book();
        mysteryNovel.novel();
        mysteryNovel.print();
    }
}