package com.mit.raunak.fitnessnew;



import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.Toolbar;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class Forearms extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearms);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarForearms);

        setSupportActionBar(myToolbar);
        if(getSupportActionBar() !=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView6);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Wrist Curls", R.drawable.forearms1, "@color/black"));
        arrayList.add(new DataModel("Wrist Curls", R.drawable.forearms2, "@color/white"));
        arrayList.add(new DataModel("Dumbell Wrist Twist", R.drawable.forearms3, "@color/white"));
        arrayList.add(new DataModel("Staning Wrist Curl", R.drawable.forearms4, "@color/white"));



        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/

        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);


        /**
         Simple GridLayoutManager that spans two columns
         **/
        /*GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);*/
    }

    @Override
    public void onItemClick(DataModel item) {

        //Videos
        setContentView(R.layout.exercise_detail);
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        //Loop Play
        videoView.setOnPreparedListener (new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        //TextView
        TextView title = findViewById(R.id.textView);
        TextView desc = findViewById(R.id.textView3);

        //
        Toolbar mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        //


        switch (arrayList.indexOf(item)) {

            case 0:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex48));
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc48));
                mToolbar.setTitle(item.text);

                // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex49));

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc49));
                mToolbar.setTitle(item.text);

                break;


            case 2:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex120);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc120));
                mToolbar.setTitle(item.text);

                break;

            case 3:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex121);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc121));
                mToolbar.setTitle(item.text);

                break;

            default:
                Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}



