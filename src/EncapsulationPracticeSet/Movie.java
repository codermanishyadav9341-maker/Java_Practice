package EncapsulationPracticeSet;

public class Movie {
    private String name;
    private double rating;

    //Constructor;
    public Movie(String name,double rating){
        setName(name);
        setRating(rating);
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be negative");
        }
         this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRating(double rating){
        if(rating < 0){
            throw new IllegalArgumentException("Rating must be  positive");
        }
         this.rating = rating;
    }

    public double getRating(){
        return rating;
    }

    public static void main(String[] args){
        try{
            Movie movie = new Movie("Meharwan",9.5);

            System.out.println("Movie name:- " +movie.getName());
            System.out.println("Rating:- " +movie.getRating());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
