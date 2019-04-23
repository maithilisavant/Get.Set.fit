package com.mit.raunak.fitnessnew;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity{

    SharedPreferences sharedpreferences;
    EditText name;
    EditText email;
    EditText dob;
    EditText gender;
    EditText weight;
    EditText height;

    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    public static final String DOB = "dobKey";
    public static final String Weight = "weightKey";
    public static final String Gender = "genderKey";
    public static final String  Height= "heightKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et_fullname);
        email = findViewById(R.id.et_email);
        dob = findViewById(R.id.et_dob);
        gender=findViewById(R.id.et_gender);
        weight=findViewById(R.id.et_weight);
        height=findViewById(R.id.et_height);

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Email)) {
            email.setText(sharedpreferences.getString(Email, ""));
        }
        if (sharedpreferences.contains(DOB)) {
            dob.setText(sharedpreferences.getString(DOB, ""));
        }
        if (sharedpreferences.contains(Weight)) {
            dob.setText(sharedpreferences.getString(Weight, ""));
        }
        if (sharedpreferences.contains(Height)) {
            dob.setText(sharedpreferences.getString(Height, ""));
        }
        if (sharedpreferences.contains(Gender)) {
            dob.setText(sharedpreferences.getString(Gender, ""));
        }
    }

    public void save (View view)
    {
        String n = name.getText().toString();
        String e = email.getText().toString();
        String d = dob.getText().toString();
        String g = gender.getText().toString();
        String w = weight.getText().toString();
        String h = height.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(Email, e);
        editor.putString(DOB, d);
        editor.putString(Gender, g);
        editor.putString(Weight, w);
        editor.putString(Height, h);
        editor.commit();

        Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_LONG).show();

        name.setText("");
        email.setText("");
        dob.setText("");
        gender.setText("");
        weight.setText("");
        height.setText("");
    }

/*
    public void load (View view){
        name = (EditText) findViewById(R.id.et_fullname);
        email = (EditText) findViewById(R.id.et_email);
        dob = (EditText) findViewById(R.id.et_dob);
        gender = (EditText) findViewById(R.id.et_gender);
        weight = (EditText) findViewById(R.id.et_weight);
        height = (EditText) findViewById(R.id.et_height);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Email)) {
            email.setText(sharedpreferences.getString(Email, ""));
        }
        if (sharedpreferences.contains(DOB)) {
            dob.setText(sharedpreferences.getString(DOB, ""));
        }
        if (sharedpreferences.contains(Gender)) {
            name.setText(sharedpreferences.getString(Gender, ""));
        }
        if (sharedpreferences.contains(Weight)) {
            email.setText(sharedpreferences.getString(Weight, ""));
        }
        if (sharedpreferences.contains(Height)) {
            dob.setText(sharedpreferences.getString(Height, ""));
        }
    }
    */
}