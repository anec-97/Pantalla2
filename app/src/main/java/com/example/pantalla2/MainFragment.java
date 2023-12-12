package com.example.pantalla2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.BaseCardView;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;

public class MainFragment extends BrowseSupportFragment implements OnItemViewClickedListener {
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pantallaInicio();
    }
    private void pantallaInicio(){
        setTitle("Angel Giovanny Vidal Castillo");
        setHeadersState(HEADERS_ENABLED);
        setBrandColor(getResources().getColor(android.R.color.holo_red_dark));
        cargarDatos();
        setOnItemViewClickedListener(this);
    }

    private void cargarDatos(){
        HeaderItem categoria1 = new HeaderItem(0,"Accion");
        HeaderItem categoria2 = new HeaderItem(1,"Suspenso");
        HeaderItem categoria3 = new HeaderItem(2,"Comedia");
        HeaderItem categoria4 = new HeaderItem(3,"Romance");
        HeaderItem categoria5 = new HeaderItem(4,"Drama");
        HeaderItem categoria6 = new HeaderItem(5,"Anime");

        ArrayObjectAdapter adapterFila1 = new ArrayObjectAdapter(new MyPresenter());
        //fila1
        adapterFila1.add(new SingleRowView("Accion Movie 1", getResources().getDrawable(R.mipmap.jw1,getContext().getTheme())));
        adapterFila1.add(new SingleRowView("Accion Movie 2", getResources().getDrawable(R.mipmap.jw2, getContext().getTheme())));
        adapterFila1.add(new SingleRowView("Accion Movie 3", getResources().getDrawable(R.mipmap.jw3, getContext().getTheme())));
        adapterFila1.add(new SingleRowView("Accion Movie 4", getResources().getDrawable(R.mipmap.jw4, getContext().getTheme())));
        adapterFila1.add(new SingleRowView("Accion Movie 5", getResources().getDrawable(R.mipmap.jw5, getContext().getTheme())));
        ArrayObjectAdapter windowAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        windowAdapter.add(new ListRow(categoria1,adapterFila1));

        // Categoría 2: Suspenso
        ArrayObjectAdapter adapterFila2 = new ArrayObjectAdapter(new MyPresenter());
        adapterFila2.add(new SingleRowView("Suspense Movie 1", getResources().getDrawable(R.mipmap.c1, getContext().getTheme())));
        adapterFila2.add(new SingleRowView("Suspense Movie 2", getResources().getDrawable(R.mipmap.c2, getContext().getTheme())));
        adapterFila2.add(new SingleRowView("Suspense Movie 3", getResources().getDrawable(R.mipmap.c3, getContext().getTheme())));
        adapterFila2.add(new SingleRowView("Suspense Movie 4", getResources().getDrawable(R.mipmap.c4, getContext().getTheme())));
        adapterFila2.add(new SingleRowView("Suspense Movie 5", getResources().getDrawable(R.mipmap.c5, getContext().getTheme())));
        windowAdapter.add(new ListRow(categoria2, adapterFila2));

        // Categoría 3: comedia
        ArrayObjectAdapter adapterFila3 = new ArrayObjectAdapter(new MyPresenter());
        adapterFila3.add(new SingleRowView("Comedia Movie 1", getResources().getDrawable(R.mipmap.sm1, getContext().getTheme())));
        adapterFila3.add(new SingleRowView("Comedia Movie 2", getResources().getDrawable(R.mipmap.sm2, getContext().getTheme())));
        adapterFila3.add(new SingleRowView("Comedia Movie 3", getResources().getDrawable(R.mipmap.sm3, getContext().getTheme())));
        adapterFila3.add(new SingleRowView("Comedia Movie 4", getResources().getDrawable(R.mipmap.sm4, getContext().getTheme())));
        adapterFila3.add(new SingleRowView("Comedia Movie 5", getResources().getDrawable(R.mipmap.sm5, getContext().getTheme())));
        windowAdapter.add(new ListRow(categoria3, adapterFila3));

        // Categoría 4: c  Romance
        ArrayObjectAdapter adapterFila4 = new ArrayObjectAdapter(new MyPresenter());
        adapterFila4.add(new SingleRowView("Romance Movie 1", getResources().getDrawable(R.mipmap.cre1, getContext().getTheme())));
        adapterFila4.add(new SingleRowView("Romance Movie 2", getResources().getDrawable(R.mipmap.cre2, getContext().getTheme())));
        adapterFila4.add(new SingleRowView("Romance Movie 3", getResources().getDrawable(R.mipmap.cre3, getContext().getTheme())));
        adapterFila4.add(new SingleRowView("Romance Movie 4", getResources().getDrawable(R.mipmap.cre4, getContext().getTheme())));
        adapterFila4.add(new SingleRowView("Romance Movie 5", getResources().getDrawable(R.mipmap.cre5, getContext().getTheme())));
        windowAdapter.add(new ListRow(categoria4, adapterFila4));

        // Categoría 5: Drama
        ArrayObjectAdapter adapterFila5 = new ArrayObjectAdapter(new MyPresenter());
        adapterFila5.add(new SingleRowView("Drama Movie 1", getResources().getDrawable(R.mipmap.done, getContext().getTheme())));
        adapterFila5.add(new SingleRowView("Drama Movie 2", getResources().getDrawable(R.mipmap.dtwo, getContext().getTheme())));
        adapterFila5.add(new SingleRowView("Drama Movie 3", getResources().getDrawable(R.mipmap.dthree, getContext().getTheme())));
        adapterFila5.add(new SingleRowView("Drama Movie 4", getResources().getDrawable(R.mipmap.dfour, getContext().getTheme())));
        adapterFila5.add(new SingleRowView("Drama Movie 5", getResources().getDrawable(R.mipmap.dfive, getContext().getTheme())));
        windowAdapter.add(new ListRow(categoria5, adapterFila5));

        // Categoría 6: Anime
        ArrayObjectAdapter adapterFila6 = new ArrayObjectAdapter(new MyPresenter());
        adapterFila6.add(new SingleRowView("Anime Movie 1", getResources().getDrawable(R.mipmap.o1, getContext().getTheme())));
        adapterFila6.add(new SingleRowView("Anime Movie 2", getResources().getDrawable(R.mipmap.o2, getContext().getTheme())));
        adapterFila6.add(new SingleRowView("Anime Movie 3", getResources().getDrawable(R.mipmap.o3, getContext().getTheme())));
        adapterFila6.add(new SingleRowView("Anime Movie 4", getResources().getDrawable(R.mipmap.o4, getContext().getTheme())));
        adapterFila6.add(new SingleRowView("Anime Movie 5", getResources().getDrawable(R.mipmap.o5, getContext().getTheme())));
        windowAdapter.add(new ListRow(categoria6, adapterFila6));




        setAdapter(windowAdapter);
    }

    @Override
    public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row) {
        Intent intent = new Intent(getActivity(), DetailsActivity.class);
        startActivity(intent);
    }

    private  class MyPresenter extends Presenter{

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
            ImageCardView icv = new ImageCardView(viewGroup.getContext());
            icv.setCardType(BaseCardView.CARD_TYPE_INFO_UNDER_WITH_EXTRA);
            icv.setInfoVisibility(BaseCardView.CARD_REGION_VISIBLE_ACTIVATED);
            return new ViewHolder(icv);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, Object object) {
            SingleRowView srv = (SingleRowView) object;
            ImageCardView icv = ((ImageCardView) viewHolder.view);
            icv.setMainImage(srv.getImage());
            icv.setMainImageDimensions(313,176);
            icv.setTitleText(srv.getName());
            icv.setContentText("Descripcion de la pelicula");
        }

        @Override
        public void onUnbindViewHolder(ViewHolder viewHolder) {

        }

    }
}
