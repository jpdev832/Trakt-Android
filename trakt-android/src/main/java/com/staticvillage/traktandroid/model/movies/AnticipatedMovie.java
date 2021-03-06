package com.staticvillage.traktandroid.model.movies;

import com.google.gson.annotations.SerializedName;
import com.staticvillage.traktandroid.model.common.Movie;

/**
 * Created by joelparrish on 10/30/16.
 */

public class AnticipatedMovie {
    @SerializedName("list_count")
    private long listCount;
    private Movie movie;

    public long getListCount() {
        return listCount;
    }

    public void setListCount(long listCount) {
        this.listCount = listCount;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
