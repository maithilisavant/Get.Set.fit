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

public class Chest extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarChest);

        setSupportActionBar(myToolbar);
        if(getSupportActionBar() !=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Bench Presses", R.drawable.chest1, "@color/black"));
        arrayList.add(new DataModel("Incline Presses", R.drawable.chest2, "@color/white"));
        arrayList.add(new DataModel("Dumbell Presses", R.drawable.chest3, "@color/white"));
        arrayList.add(new DataModel("Parallel Bar Dips", R.drawable.chest4, "@color/white"));
        arrayList.add(new DataModel("Cable Flys", R.drawable.chest5, "@color/white"));
        arrayList.add(new DataModel("Dumbell Flys", R.drawable.chest6, "@color/white"));
        arrayList.add(new DataModel("Dumbell Pullovers", R.drawable.chest7, "@color/white"));
        arrayList.add(new DataModel("Push-Ups", R.drawable.chest8, "@color/white"));
        arrayList.add(new DataModel("Dumbell Press", R.drawable.chest9, "@color/white"));
        arrayList.add(new DataModel("Barbell Bench Press", R.drawable.chest10, "@color/white"));
        arrayList.add(new DataModel("Pec Dec Flies", R.drawable.chest11, "@color/white"));
        arrayList.add(new DataModel("Decline Pushup", R.drawable.chest12, "@color/white"));
        arrayList.add(new DataModel("Incline Pushup", R.drawable.chest13, "@color/white"));
        arrayList.add(new DataModel("Medicine Ball Pushup", R.drawable.chest14, "@color/white"));
        arrayList.add(new DataModel("Modified Push up", R.drawable.chest15, "@color/white"));
        arrayList.add(new DataModel("Single Arm Push up", R.drawable.chest16, "@color/white"));
        arrayList.add(new DataModel("Stablity Ball Flat Dumbell Fly", R.drawable.chest17, "@color/white"));
        arrayList.add(new DataModel("Stability Ball flat Chest Press", R.drawable.chest18, "@color/white"));
        arrayList.add(new DataModel("Stability Ball Push up", R.drawable.chest19, "@color/white"));
        arrayList.add(new DataModel("Weighted Push up", R.drawable.chest20, "@color/white"));


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
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex37));
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc37));
                mToolbar.setTitle(item.text);

                // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex38));

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc38));
                mToolbar.setTitle(item.text);

                break;


            case 2:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex39);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc39));
                mToolbar.setTitle(item.text);

                break;

            case 3:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex40);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc40));
                mToolbar.setTitle(item.text);

                break;

            case 4:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex41);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc41));
                mToolbar.setTitle(item.text);
                break;

            case 5:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex42);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc42));
                mToolbar.setTitle(item.text);

                break;


            case 6:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex43);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc43));

                break;

            case 7:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex44);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc44));

                break;

            case 8:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex45);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc45));

                break;


            case 9:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex46);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc46));

                break;

            case 10:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex47);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc47));

                break;

            case 11:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex108);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc108));

                break;

            case 12:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex109);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc109));

                break;


            case 13:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex110);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc110));

                break;


            case 14:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex111);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc111));

                break;
            case 15:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex112);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc112));

                break;
            case 16:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex113);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc113));

                break;
            case 17:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex114);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc114));

                break;
            case 18:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex115);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc115));

                break;
            case 19:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex116);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc116));

                break;

            case 20:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex117);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc117));

                break;
            case 22:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex118);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc118));

                break;
            case 23:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex119);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc119));

                break;

            default:
                Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}



