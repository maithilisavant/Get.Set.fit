package com.mit.raunak.fitnessnew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    SharedPreferences prefs = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("com.mit.raunak.fitnessnew", MODE_PRIVATE);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (prefs.getBoolean("firstrun", true)) {
            Intent intent = new Intent(this, Beginscreen.class);
            startActivity(intent);
            finish();
            prefs.edit().putBoolean("firstrun", false).commit();
        }
        else
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        }
}