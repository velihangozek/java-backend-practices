package org.velihangozek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        Movie firstMovie = new Movie("The Godfather", 1972, "Crime", 9.2);
        Movie secondMovie = new Movie("Inception", 2010, "Sci-Fi", 8.8);
        Movie thirdMovie = new Movie("The Matrix", 1999, "Cyberpunk", 8.7);
        Movie fourthMovie = new Movie("Fight Club", 2000, "Thriller", 9.0);
        Movie fifthMovie = new Movie("The Dark Knight", 2008, "Action", 9.1);

        movieList.add(firstMovie);
        movieList.add(secondMovie);
        movieList.add(thirdMovie);
        movieList.add(fourthMovie);
        movieList.add(fifthMovie);

        // Sort by IMDb rating descending (natural order)
        movieList.sort(null);
        System.out.println("\n=== Sorted by Rating (High ==> Low) ===");;
        movieList.forEach(System.out::println);

        // Sort by release year ascending
        movieList.sort(Comparator.comparingInt(Movie::getReleaseYear));
        System.out.println("\n=== Sorted by Release Year (Old ==> New) ===");
        movieList.forEach(System.out::println);

        // Filter by genre
        System.out.println("\n=== Movies by Genre ===");

        System.out.println("\n=== Crime ===");
        filterByGenre(movieList, "Crime");

        System.out.println("\n=== Sci-Fi ===");
        filterByGenre(movieList, "Sci-Fi");

        System.out.println("\n=== Cyberpunk ===");
        filterByGenre(movieList, "Cyberpunk");

        System.out.println("\n=== Thriller ===");
        filterByGenre(movieList, "Thriller");

        System.out.println("\n=== Action ===");
        filterByGenre(movieList, "Action");

    }

    // Print only movies matching the given genre
    public static void filterByGenre(List<Movie> movies, String genre) {
        movies.stream()
                .filter(movie -> movie.getMovieGenre().equalsIgnoreCase(genre))
                .forEach(System.out::println);
    }
}