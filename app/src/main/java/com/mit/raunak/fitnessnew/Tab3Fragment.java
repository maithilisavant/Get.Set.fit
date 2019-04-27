package com.mit.raunak.fitnessnew;


import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass
 */
public class Tab3Fragment extends Fragment implements View.OnClickListener {
    private CardView bmicard, nearbycard, stepcard, heartcard, editcard;

    public Tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);
        stepcard = (CardView) view.findViewById(R.id.stepcounter);
        bmicard = (CardView) view.findViewById(R.id.bmi);
        heartcard = (CardView) view.findViewById(R.id.heartrate);
        nearbycard = (CardView) view.findViewById(R.id.nearby);
        editcard = (CardView) view.findViewById(R.id.edit);


        stepcard.setOnClickListener(this);
        bmicard.setOnClickListener(this);
        heartcard.setOnClickListener(this);
        nearbycard.setOnClickListener(this);
        editcard.setOnClickListener(this);
        //return inflater.inflate(R.layout.fragment_tab3, container, false);

        return view;

    }

    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.stepcounter:
                i = new Intent(getActivity(), Step_Main.class);
            startActivity(i);
                break;
            case R.id.bmi:
                i = new Intent(getActivity(), BMI.class);
                startActivity(i);
                break;
            case R.id.heartrate:
                i = new Intent(getActivity(), HeartRate.class);
                startActivity(i);
                break;
            case R.id.nearby:

                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, "Nearby Gyms"); // query contains search string
                startActivity(intent);
                break;
            case R.id.edit:
                i = new Intent(getActivity(), EditUserDetails.class);
                startActivity(i);
                break;
                default:
                    break;
        }
    }
}