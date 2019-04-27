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

public class Legs extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarLegs);

        setSupportActionBar(myToolbar);
        if(getSupportActionBar() !=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView5);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Squats", R.drawable.leg11, "@color/black"));
        arrayList.add(new DataModel("ANgled Leg Presses", R.drawable.leg2, "@color/white"));
        arrayList.add(new DataModel("Leg Extensions", R.drawable.leg3, "@color/white"));
        arrayList.add(new DataModel("Dumbell Lunges", R.drawable.leg4, "@color/white"));
        arrayList.add(new DataModel("Cable Kick Backs", R.drawable.leg5, "@color/white"));
        arrayList.add(new DataModel("Dumbell Squats", R.drawable.leg6, "@color/white"));
        arrayList.add(new DataModel("Front Squats", R.drawable.leg7, "@color/white"));
        arrayList.add(new DataModel("Power Squats", R.drawable.leg8, "@color/white"));
        arrayList.add(new DataModel("THack Squats", R.drawable.leg9, "@color/white"));
        arrayList.add(new DataModel("Seated Leg Curl", R.drawable.leg10, "@color/white"));
        arrayList.add(new DataModel("Barbell Lunge", R.drawable.leg11, "@color/white"));
        arrayList.add(new DataModel("Barbell Squat(Assisted)", R.drawable.leg12, "@color/white"));
        arrayList.add(new DataModel("Barbell Squat Overheaf", R.drawable.leg13, "@color/white"));
        arrayList.add(new DataModel("Bench Jump", R.drawable.leg14, "@color/white"));
        arrayList.add(new DataModel("Bulgarian Squat Split", R.drawable.leg15, "@color/white"));
        arrayList.add(new DataModel("Bulgarian Split Squat No Weights", R.drawable.leg16, "@color/white"));
        arrayList.add(new DataModel("Dumbell Side Lunge", R.drawable.leg17, "@color/white"));
        arrayList.add(new DataModel("Good Morning", R.drawable.leg18, "@color/white"));
        arrayList.add(new DataModel("One Arm Side Deadlift", R.drawable.leg19, "@color/white"));
        arrayList.add(new DataModel("Single Leg Squat", R.drawable.leg20, "@color/white"));

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
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex50));
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc50));
                mToolbar.setTitle(item.text);

                // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex51));

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc51));
                mToolbar.setTitle(item.text);

                break;


            case 2:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex52);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc52));
                mToolbar.setTitle(item.text);

                break;

            case 3:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex53);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc53));
                mToolbar.setTitle(item.text);

                break;

            case 4:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex54);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc54));
                mToolbar.setTitle(item.text);
                break;

            case 5:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex55);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc55));
                mToolbar.setTitle(item.text);

                break;


            case 6:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex56);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc56));

                break;

            case 7:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex57);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc57));

                break;

            case 8:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex58);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc58));

                break;


            case 9:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex59);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc59));

                break;

            case 10:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex122);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc122));

                break;

            case 11:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex123);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc123));

                break;

            case 12:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex124);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc124));

                break;


            case 13:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex125);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc125));

                break;


            case 14:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex126);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc126));

                break;


            case 15:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex127);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc127));

                break;

            case 16:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex128);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc128));

                break;

            case 17:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex129);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc129));

                break;

            case 18:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex130);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc130));

                break;
            case 19:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex130);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc131));

                break;

            default:
                Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}



