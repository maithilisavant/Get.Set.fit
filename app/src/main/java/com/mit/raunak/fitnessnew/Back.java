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

public class Back extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        Toolbar myToolbar2 = (Toolbar) findViewById(R.id.toolbarBack);

        setSupportActionBar(myToolbar2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView2);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Chin-Ups", R.drawable.back1, "@color/black"));
        arrayList.add(new DataModel("Deadlifts", R.drawable.back2, "@color/white"));
        arrayList.add(new DataModel("Lat Pull-Downs", R.drawable.back3, "@color/white"));
        arrayList.add(new DataModel("Seated Rows", R.drawable.back4, "@color/white"));
        arrayList.add(new DataModel("One-Arm Dumbell Rows", R.drawable.back5, "@color/white"));
        arrayList.add(new DataModel("Barbell Shrugs", R.drawable.back6, "@color/white"));
        arrayList.add(new DataModel("Dumbell Shrugs", R.drawable.back7, "@color/white"));
        arrayList.add(new DataModel("Back Extensions", R.drawable.back8, "@color/white"));
        arrayList.add(new DataModel("Bent Over Row", R.drawable.back9, "@color/white"));
        arrayList.add(new DataModel("Reverse Chinups", R.drawable.back10, "@color/white"));
        arrayList.add(new DataModel("Bodyweight Superman", R.drawable.back11, "@color/white"));
        arrayList.add(new DataModel("Dumbells Bent Over Rows", R.drawable.back12, "@color/white"));
        arrayList.add(new DataModel("Stability Ball Extension", R.drawable.back13, "@color/white"));
        arrayList.add(new DataModel("Seated Bent Over Row", R.drawable.back14, "@color/white"));
        arrayList.add(new DataModel("T-Bar Bent Over Row", R.drawable.back15, "@color/white"));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList,this);
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

        //TextView
        TextView title = findViewById(R.id.textView);
        TextView desc = findViewById(R.id.textView3);

        //
        Toolbar mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        //
        //Loop Play
        videoView.setOnPreparedListener (new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


        //Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();


        switch (arrayList.indexOf(item)) {

            case 0:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex15));
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc15));
                mToolbar.setTitle(item.text);

                // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex16));

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc16));
                mToolbar.setTitle(item.text);

                break;


            case 2:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex17);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc17));
                mToolbar.setTitle(item.text);

                break;

            case 3:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex18);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc18));
                mToolbar.setTitle(item.text);

                break;

            case 4:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex19);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc19));
                mToolbar.setTitle(item.text);
                break;

            case 5:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex20);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc20));
                mToolbar.setTitle(item.text);

                break;


            case 6:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex21);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc21));

                break;

            case 7:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex22);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc22));

                break;

            case 8:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex23);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc23));

                break;


            case 9:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex24);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc24));

                break;

            case 10:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex86);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc86));

                break;

            case 11:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex87);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc87));

                break;

            case 12:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex88);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc88));

                break;


            case 13:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex89);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc89));

                break;


            case 14:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex90);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc90));

                break;

            default:
                Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}