package com.staticvillage.trakt_android.movie;

import com.staticvillage.trakt_android.App;
import com.staticvillage.trakt_android.common.ExtendedResultFragment;

import rx.Observable;

/**
 * Created by joelparrish on 11/6/16.
 */

public class PopularFragment extends ExtendedResultFragment {
    public static PopularFragment newInstance() {
        return new PopularFragment();
    }

    @Override
    public Observable<String> getResult() {
        boolean extended = extendedCheckBox.isChecked();
        return App.getTraktService()
                .getPopularMovies(0, 10, extended, null)
                .map(response -> gson.toJson(response));
    }
}
