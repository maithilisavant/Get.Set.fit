package com.mit.raunak.fitnessnew;



import android.app.Activity;
import android.content.Intent;
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

public class Biceps extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarBicep);

        setSupportActionBar(myToolbar);
        if(getSupportActionBar() !=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView3);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Curls", R.drawable.bicep1, "@color/black"));
        arrayList.add(new DataModel("Barbell Curls", R.drawable.bicep2, "@color/white"));
        arrayList.add(new DataModel("Preacher Curls", R.drawable.bicep3, "@color/white"));
        arrayList.add(new DataModel("Hammer Curls", R.drawable.bicep4, "@color/white"));
        arrayList.add(new DataModel("Concentration Curls", R.drawable.bicep5, "@color/white"));
        arrayList.add(new DataModel("Reverse Curls", R.drawable.bicep6, "@color/white"));
        arrayList.add(new DataModel("Cable Biceps Curl", R.drawable.bicep7, "@color/white"));
        arrayList.add(new DataModel("Low Pully Curls", R.drawable.bicep8, "@color/white"));
        arrayList.add(new DataModel("Low Pully Cable Crossover", R.drawable.bicep9, "@color/white"));
        arrayList.add(new DataModel("Dumbbells Biceps Curls(Hammer Grip On Bench)", R.drawable.bicep10, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Curls(Hammer Grip Sanding)", R.drawable.bicep11, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Curls(Understanding Grip Concentration Wih Single Arm)", R.drawable.bicep12, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Curls(Underhand Grip On Bench)", R.drawable.bicep15, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Curls Seated(Hammer Grip)", R.drawable.bicep13, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Curl Seated(Underhand Grip)", R.drawable.bicep14, "@color/white"));
        arrayList.add(new DataModel("Stability Ball Dumbbell Biceps Curls(Hammer Grip)", R.drawable.bicep16, "@color/black"));
        arrayList.add(new DataModel("Stability Ball Dumbbell Biceps Curl(Underhand Grip)", R.drawable.bicep17, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Curl Seated", R.drawable.bicep18, "@color/white"));
        arrayList.add(new DataModel("Dumbbell Biceps Preacher Curl", R.drawable.bicep19, "@color/white"));
        arrayList.add(new DataModel("Underhand Grip Prone On An Incline Bench", R.drawable.bicep20, "@color/white"));

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

        //TextView
        TextView title = findViewById(R.id.textView);
        TextView desc = findViewById(R.id.textView3);

        //
        Toolbar mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        //


        switch (arrayList.indexOf(item)) {

            case 0:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex28));
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc161));
                mToolbar.setTitle(item.text);

                // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

            case 1:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex30));

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc26));
                mToolbar.setTitle(item.text);

                break;


            case 2:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex27);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc27));
                mToolbar.setTitle(item.text);

                break;

            case 3:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex28);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc28));
                mToolbar.setTitle(item.text);

                break;

            case 4:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex29);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc215));
                mToolbar.setTitle(item.text);
                break;

            case 5:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex30);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc30));
                mToolbar.setTitle(item.text);

                break;


            case 6:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex31);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc31));

                break;

            case 7:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex32);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc32));

                break;

            case 8:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex33);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc33));

                break;


            case 9:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex92);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc91));

                break;

            case 10:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex92);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc92));

                break;

            case 11:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex93);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc92));

                break;

            case 12:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex94);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc94));

                break;


            case 13:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex48);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc95));

                break;


            case 14:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex97);
                mToolbar.setTitle(item.text);
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc96));

                break;

            case 15:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex98));
                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc37));
                mToolbar.setTitle(item.text);

                // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

            case 16:
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex99));

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc97));
                mToolbar.setTitle(item.text);

                break;


            case 17:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex100);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc96));
                mToolbar.setTitle(item.text);

                break;

            case 18:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex101);

                videoView.start();
                title.setText(item.text);
                desc.setText(getString(R.string.ex_desc100));
                mToolbar.setTitle(item.text);

                break;

            default:
                Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}