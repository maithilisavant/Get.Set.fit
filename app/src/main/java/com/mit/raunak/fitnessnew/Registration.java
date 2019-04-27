package com.mit.raunak.fitnessnew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Registration extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    EditText name;
    EditText dob;
    String gender;
    float bmi;
    EditText weight;
    EditText height;
    RadioGroup rgGender;
    RadioButton rgBtn;

    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String DOB = "dobKey";
    public static final String BMI= "bmiKey";
    public static final String Weight = "weightKey";
    public static final String Gender = "genderKey";
    public static final String Height = "heightKey";
    /*AwesomeValidation awesomeValidation;*/
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*AwesomeValidation awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);*/

        rgGender = (RadioGroup) findViewById(R.id.radioGender);
        name = findViewById(R.id.et_fullname);
        dob = findViewById(R.id.et_dob);
        weight = findViewById(R.id.et_weight);
        height = findViewById(R.id.et_height);

        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(DOB)) {
            dob.setText(sharedpreferences.getString(DOB, ""));
        }
        if (sharedpreferences.contains(Weight)) {
            weight.setText(sharedpreferences.getString(Weight, ""));
        }
        if (sharedpreferences.contains(Height)) {
            height.setText(sharedpreferences.getString(Height, ""));
        }

        /*awesomeValidation.addValidation(this, R.id.et_fullname, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.et_dob, "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.et_height, " ", R.string.blanktexxterror);
        awesomeValidation.addValidation(this, R.id.et_weight, " ", R.string.blanktexxterror);
        awesomeValidation.addValidation(this, R.id.et_fullname," " , R.string.blanktexxterror);
        awesomeValidation.addValidation(this, R.id.et_dob," " , R.string.blanktexxterror);*/

    }

    public void save(View view) {
        int id = rgGender.getCheckedRadioButtonId();
        rgBtn = (RadioButton) findViewById(id);
        gender = rgBtn.getText().toString();

        Float f = bmi;
        String g = gender;
        String n = name.getText().toString();
        String d = dob.getText().toString();
        String w = weight.getText().toString();
        String h = height.getText().toString();

        float heightVal = Float.parseFloat(h) / 100;
        float weightVal = Float.parseFloat(w);
        bmi = weightVal / (heightVal * heightVal);
        String b = String.format("%.2f", bmi);

        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(DOB, d);
        editor.putString(Gender, g);
        editor.putString(Weight, w);
        editor.putString(Height, h);
        editor.putString(BMI, b);
        editor.apply();

        Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_LONG).show();

        name.setText("");
        dob.setText("");
        /*gender.equals("");*/
        weight.setText("");
        height.setText("");

        Intent intent = new Intent(Registration.this, MainActivity.class);
        startActivity(intent);


    }
}
