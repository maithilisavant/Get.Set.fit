package com.mit.raunak.fitnessnew;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;


import java.util.Random;

import static com.mit.raunak.fitnessnew.Registration.Height;
import static com.mit.raunak.fitnessnew.Registration.Name;
import static com.mit.raunak.fitnessnew.Step_Main.mypreference;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {

    public CardView cardone, cardtwo, cardthree, cardfour;
    public TextView textView1, steptext, steptext2,weight;
    SharedPreferences sharedpreferences;
    public static final String Weight = "weightKey";
    //public static final String mypreference = "mypref";
    private String[] quotes;

    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
//First Card
        cardone = view.findViewById(R.id.card1);

        //Step text
        textView1 = view.findViewById(R.id.card1text1);
        steptext = view.findViewById(R.id.textstep);
        sharedpreferences = this.getActivity().getSharedPreferences(mypreference,Context.MODE_PRIVATE);
        String value = sharedpreferences.getString("step", "");
        steptext.setText(value);

        //Quotes
        TextView quote=view.findViewById(R.id.quote);
        quotes = getResources().getStringArray(R.array.quotes);
        int randomIndex = new Random().nextInt(quotes.length);
        String randomName = quotes[randomIndex];
        quote.setText(randomName);

        //Weight
        TextView weight=view.findViewById(R.id.textweight);
        String w= sharedpreferences.getString(Weight, null);
       weight.setText(w);
        int weightint= Integer.parseInt(w);


       //BMI
        TextView bmidisplay=view.findViewById(R.id.bmitext);
String h=sharedpreferences.getString(Height,"");
      int heightint= Integer.parseInt(h);
        double heightm1=(double) heightint/1000;
     double heightm2=(double) (heightm1*heightm1)*10;
         double bmi=(double) (weightint*heightm2);

        String bmistring=Double.toString(bmi);
        bmistring=String.format("%.2f", bmi);
              bmidisplay.setText(bmistring);

        //Ideal Weight
        TextView idealweight=view.findViewById(R.id.idealweight);
        float hm1=(float)heightint/100;
        double hm2=(double)hm1*hm1;

       double idealw=(double)22*hm2;
       String iw=Double.toString(idealw);
       iw=String.format("%.2f",idealw);
       idealweight.setText(iw+" kg");

        //Water Intake

        TextView water1=view.findViewById(R.id.watertext);
        double waterweight=(double) weightint/30;
        String waterweights=Double.toString(waterweight);
        waterweights=String.format("%.2f", waterweight);
         water1.setText(waterweights+ " litres");



        //Protein

        TextView protein=view.findViewById(R.id.proteintext);
        double proteinc=(double) weightint* 1.8;
        String proteinfinal=Double.toString(proteinc);
       proteinfinal=String.format("%.2f", proteinc);
       protein.setText(proteinfinal+ " g");

       // Name
        String n= sharedpreferences.getString(Name, null);
        TextView name=view.findViewById(R.id.card1text1);
        name.setText("Welcome"+" "+n +"!");

        return view;

    }
}




