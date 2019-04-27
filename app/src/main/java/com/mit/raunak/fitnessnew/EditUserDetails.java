package com.mit.raunak.fitnessnew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditUserDetails extends AppCompatActivity{

    SharedPreferences sharedpreferences;
    EditText name;
    EditText dob;
    EditText gender;
    EditText weight;
    EditText height;

    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String DOB = "dobKey";
    public static final String Weight = "weightKey";
    public static final String Gender = "genderKey";
    public static final String Height= "heightKey";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edituserdetails);

        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        name = findViewById(R.id.et_fullname);
        dob = findViewById(R.id.et_dob);
        weight = findViewById(R.id.et_weight);
        height = findViewById(R.id.et_height);
        gender = findViewById(R.id.et_gender);

        String n= sharedpreferences.getString(Name, null);
        String d= sharedpreferences.getString(DOB, null);
        String w= sharedpreferences.getString(Weight, null);
        String g= sharedpreferences.getString(Gender, null);
        String h= sharedpreferences.getString(Height, null);
        name.setText(n);
        dob.setText(d);
        gender.setText(g);
        weight.setText(w);
        height.setText(h);
    }

    public void save (View view)
    {
        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        name = findViewById(R.id.et_fullname);
        dob = findViewById(R.id.et_dob);
        weight = findViewById(R.id.et_weight);
        height = findViewById(R.id.et_height);
        gender = findViewById(R.id.et_gender);

        String n = name.getText().toString();
        String d = dob.getText().toString();
        String g = gender.getText().toString();
        String w = weight.getText().toString();
        String h = height.getText().toString();

        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(Name, n);
        editor.putString(DOB, d);
        editor.putString(Gender, g);
        editor.putString(Weight, w);
        editor.putString(Height, h);
        editor.apply();

        Toast.makeText(getApplicationContext(),"Edit Successful",Toast.LENGTH_LONG).show();
        finish();
        /*Intent intent=new Intent(EditUserDetails.this,Tab3Fragment.class);
        startActivity(intent);*/
    }


}