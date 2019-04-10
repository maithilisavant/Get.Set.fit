package com.mit.raunak.fitnessnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Beginscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginscreen);
    }
    public void onClick(View view)
    {
        Intent intent=new Intent(Beginscreen.this,Registration.class);
        startActivity(intent);
    }
}
