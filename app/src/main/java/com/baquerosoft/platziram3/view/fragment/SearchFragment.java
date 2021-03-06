package com.baquerosoft.platziram3.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baquerosoft.platziram3.R;
import com.baquerosoft.platziram3.adapter.PictureAdapterRecyclerView;
import com.baquerosoft.platziram3.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecyclerSearch);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,LinearLayoutManager.VERTICAL,false);

        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(),R.layout.cardview_picture,getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;

    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();

        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Wilinton Baquero","4 días","20 Me gusta"));
        pictures.add(new Picture("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg","Leidy Alcalá","4 días","0 Me gusta"));
        pictures.add(new Picture("http://www.educationquizzes.com/library/KS3-Geography/river-1-1.jpg","Carolina y Camila Baquero","4 días","200 Me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Wilinton Baquero","4 días","20 Me gusta"));
        pictures.add(new Picture("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg","Leidy Alcalá","4 días","0 Me gusta"));
        pictures.add(new Picture("http://www.educationquizzes.com/library/KS3-Geography/river-1-1.jpg","Carolina y Camila Baquero","4 días","200 Me gusta"));


        return pictures;
    }

}
