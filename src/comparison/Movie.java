package comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Harish on 4/25/2017.
 */
class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }


}

// Class to compare movies by rating
class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.getRating() < m2.getRating()) return -1 ;
        if(m1.getRating() > m2.getRating()) return 1;
        else return 0;

    }
}

//Class to compare movies by title
class NameCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
class Main{
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Batman", 9, 2001));
        movieList.add(new Movie("Batman Returns", 2, 2010));
        movieList.add(new Movie("Superman", 9, 2008));

        Collections.sort(movieList);
        System.out.println("Movies after sorting are: ");
        for(Movie movie: movieList) {
            System.out.println(movie.getName());
        }

        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movieList, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return 0;
            }
        });
        System.out.println("Movies after rating sorting are: ");
        for(Movie movie: movieList) {
            System.out.println(movie.getName());
        }


    }
}