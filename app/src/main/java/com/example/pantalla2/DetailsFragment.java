package com.example.pantalla2;

import static android.media.session.PlaybackState.ACTION_PLAY;
import static android.media.session.PlaybackState.ACTION_REWIND;

import android.os.Bundle;

import androidx.leanback.app.DetailsSupportFragment;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.SparseArrayObjectAdapter;

public class DetailsFragment extends DetailsSupportFragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        construirIU();
    }
    private void construirIU() {
        ClassPresenterSelector selector = new ClassPresenterSelector();
        selector.addClassPresenter(DetailsOverviewRow.class,
                new FullWidthDetailsOverviewRowPresenter(
                        new DetailsDescriptionPresenter()
                )
        );
        ArrayObjectAdapter madapter = new ArrayObjectAdapter(selector);
        DetailsOverviewRow detailsOverviewRow = new DetailsOverviewRow("Media item details");
        detailsOverviewRow
                .setImageDrawable(getActivity().getResources().getDrawable(R.mipmap.o1));
        SparseArrayObjectAdapter actionAdap = new SparseArrayObjectAdapter();
        actionAdap.set((int) ACTION_PLAY, new Action(1, "Comprar 100.00"));
        actionAdap.set((int) ACTION_REWIND, new Action(2,"Rentar 15.00"));
        detailsOverviewRow.setActionsAdapter(actionAdap);
        madapter.add(detailsOverviewRow);
        setAdapter(madapter);
    }
}
