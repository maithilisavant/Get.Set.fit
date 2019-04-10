package com.mit.raunak.fitnessnew;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment  {

GridLayout mainGrid;
    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        mainGrid=(GridLayout)view.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);


        return view;


    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView=(CardView)mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // Toast.makeText(getActivity(),"Index clicked at"+ finalI,Toast.LENGTH_SHORT).show();
                    final Intent intent;
                    switch(finalI)
                    {
                        case 0:
                            intent =  new Intent(getActivity(), Abs.class);
                            break;

                        case 1:
                            intent =  new Intent(getActivity(), Back.class);
                            break;
                        case 2:
                            intent =  new Intent(getActivity(), Biceps.class);
                            break;
                        case 3:
                            intent =  new Intent(getActivity(), Chest.class);
                            break;
                        case 4:
                            intent =  new Intent(getActivity(), Forearms.class);
                            break;
                        case 5:
                            intent =  new Intent(getActivity(), Legs.class);
                            break;
                        case 6:
                            intent =  new Intent(getActivity(), Shoulder.class);
                            break;
                        default:
                            intent =  new Intent(getActivity(), Triceps.class);
                            break;
                    }
                    startActivity(intent);
                }
            });
        }
    }

}
