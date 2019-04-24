package com.mit.raunak.fitnessnew;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3Fragment extends Fragment {

GridLayout mainGrid;
    public Tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);
       // mainGrid=(GridLayout)view.findViewById(R.id.mainGrid);

        //return inflater.inflate(R.layout.fragment_tab3, container, false);
        return view;

        }
    }

















