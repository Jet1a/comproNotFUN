package Movie;

import java.util.*;

public class MovieList {

    private Movie[] movielist;
    private int numberOfStories;

    public MovieList(int capacity) {
        this.movielist = new Movie[capacity];
        this.numberOfStories = 0;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public boolean isAvailable() {
        if (numberOfStories < movielist.length) {
            return true;
        } else
            return false;
    }

    public boolean addMovie(String title, double hours, int grade) {
        if (numberOfStories < movielist.length) {
            movielist[numberOfStories] = new Movie(title, hours, grade);
            numberOfStories++;
            return true;
        } else {
            System.out.println("Movie list is full. Cannot add more movies.");
            return false;
        }
    }

    public Movie getMovieAt(int slot) {
        if ((slot >= 1) && (slot <= numberOfStories)) {
            return movielist[slot - 1];
        } else {
            return null;
        }
    }

    public boolean resize(int size) {
        if (size > numberOfStories) {
            Movie[] newMovieList = new Movie[size];
            for (int i = 0; i < numberOfStories; i++) {
                newMovieList[i] = movielist[i];
            }
            movielist = newMovieList;
            return true;

        } else
            System.out.println("New size is smaller than the current number of movies.");
            return false;
    }

    public Movie searchForMovieTitle(String title) {
        for (int i = 0; i < numberOfStories; i++) {
            if (movielist[i].getTitle().equals(title)) {
                return movielist[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MovieList [movielist=" + Arrays.toString(movielist) + "]";
    }


}
