package org.velihangozek;

public class Movie implements Comparable<Movie>{
    private String movieName;
    private int releaseYear;
    private String movieGenre;
    private double imdbRating;

    public Movie(String movieName, int releaseYear, String movieGenre, double imdbRating) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.movieGenre = movieGenre;
        this.imdbRating = imdbRating;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
    public double getImdbRating() {
        return imdbRating;
    }

    // Natural order: IMDb rating **descending**
    @Override
    public int compareTo(Movie otherMovie) {
        return Double.compare(otherMovie.imdbRating, this.imdbRating);
    }

    @Override
    public String toString() {
        return "\n---------------------------------\n" +
                "Movie Name - '" + movieName + '\'' +
                "\nRelease Year - " + releaseYear +
                "\nMovie Genre - '" + movieGenre + '\'' +
                "\nIMDB Rating - " + imdbRating +
                "\n---------------------------------";
    }
}
