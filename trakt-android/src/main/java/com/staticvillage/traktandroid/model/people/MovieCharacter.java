package com.staticvillage.traktandroid.model.people;


import com.staticvillage.traktandroid.model.common.Movie;

/**
 * Created by joelparrish on 12/1/16.
 */

public class MovieCharacter {
    private String character;
    private Movie movie;

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
