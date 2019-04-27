package com.mit.raunak.fitnessnew;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;

public class BMI extends Activity{

    EditText bmiweight;
    EditText bmiheight;
    EditText bmioutput;
    EditText bmioutput2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bmi);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width= dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.6));


        bmiweight=findViewById(R.id.et_bmiw);
        bmiheight=findViewById(R.id.et_bmih);
        bmioutput=findViewById(R.id.et_output);
        bmioutput2=findViewById(R.id.et_output2);
    }

    protected void caclbmi(View view){
        bmioutput.setAlpha(1f);
        bmioutput2.setAlpha(1f);
        String heightStr = bmiheight.getText().toString();
        String weightStr = bmiweight.getText().toString();


        /*formula:weight(kg)/ height^2(cm)*/
        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);
            String b= String.format("%.2f", bmi);

            String bmiLabel;

            if (Float.compare(bmi, 15f) <= 0) {
                bmiLabel = "Very Severely Underweight";
            } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
                bmiLabel = "Severely Underweight";
            } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
                bmiLabel = "Underweight";
            } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
                bmiLabel = "Normal";
            } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
                bmiLabel ="Overweight";
            } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
                bmiLabel = "Obese Class 1";
            } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
                bmiLabel = "Obese_Class 2";
            } else {
                bmiLabel = "Obese Class 3";
            }

            bmioutput.setText("Your BMI is: "+b);
            bmioutput2.setText("Type: "+bmiLabel);


        }


    }
}