package com.mit.raunak.fitnessnew;
import android.app.Activity;
import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import android.support.v7.app.AppCompatActivity;

import android.widget.Toast;

import static java.security.AccessController.getContext;

public class Step_Main extends AppCompatActivity implements SensorEventListener {
    TextView tv_steps;
    SensorManager sensorManager;
    Sensor sensor;
    public static final String mypreference = "mypref";
    boolean running = false;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.step_count );
        tv_steps = (TextView) findViewById ( R.id.tv_steps );
        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        sensorManager = (SensorManager) getSystemService ( Context.SENSOR_SERVICE);



    }

    @Override
    protected void onResume() {
        super.onResume ();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor ( sensor.TYPE_STEP_COUNTER );

        if(countSensor!= null){
            sensorManager.registerListener ( this,countSensor,SensorManager.SENSOR_DELAY_UI );

        }else {
            Toast.makeText ( this,"SENSOR NOT FOUND",Toast.LENGTH_SHORT ).show ();
        }
    }

    @Override
    protected void onPause() {
        super.onPause ();
        running = false;
        //if you unregister the hardware will stop detecting steps
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        if (running){
            tv_steps.setText ( String.valueOf ( event.values[0] ) );
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("step",tv_steps.getText().toString());
            editor.apply();




        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}