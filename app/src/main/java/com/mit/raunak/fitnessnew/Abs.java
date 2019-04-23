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

public class Abs extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarAbs);

        setSupportActionBar(myToolbar);
       if(getSupportActionBar() !=null)
       {
           getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Incline Bench Sit-Ups", R.drawable.abs1, "@color/black"));
        arrayList.add(new DataModel("Hanging Leg Raises", R.drawable.abs2, "@color/white"));
        arrayList.add(new DataModel("Dumbell Side Raises", R.drawable.abs3, "@color/white"));
        arrayList.add(new DataModel("Crunches", R.drawable.abs4, "@color/white"));
        arrayList.add(new DataModel("Sit-ups", R.drawable.abs5, "@color/white"));
        arrayList.add(new DataModel("Leg Raises", R.drawable.abs6, "@color/white"));
        arrayList.add(new DataModel("Flat Bench Lying Leg Raises", R.drawable.abs7, "@color/white"));
        arrayList.add(new DataModel("Seated JackKnife", R.drawable.abs8, "@color/white"));
        arrayList.add(new DataModel("Twisting Hip Raise", R.drawable.abs9, "@color/white"));
        arrayList.add(new DataModel("BodyWeight Crunch", R.drawable.abs10, "@color/white"));
        arrayList.add(new DataModel("Russian Twist", R.drawable.abs11, "@color/white"));
        arrayList.add(new DataModel("Side Bridge", R.drawable.abs12, "@color/white"));
        arrayList.add(new DataModel("Bodyweight Hip Extension", R.drawable.abs15, "@color/white"));
        arrayList.add(new DataModel("Rotating T Extension", R.drawable.abs13, "@color/white"));
        arrayList.add(new DataModel("Superman", R.drawable.abs14, "@color/white"));


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
                    videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex1));
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc1));
                    mToolbar.setTitle(item.text);

                    // Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                    break;

                case 1:
                    videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ex2));

                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc2));
                    mToolbar.setTitle(item.text);

                    break;


                case 2:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex3);

                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc3));
                    mToolbar.setTitle(item.text);

                    break;

                case 3:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex4);

                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc4));
                    mToolbar.setTitle(item.text);

                    break;

                case 4:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex5);

                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc5));
                    mToolbar.setTitle(item.text);
                    break;

                case 5:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex6);

                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc6));
                    mToolbar.setTitle(item.text);

                    break;


                case 6:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex7);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc7));

                    break;

                case 7:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex8);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc8));

                    break;

                case 8:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex10);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc10));

                    break;


                case 9:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex12);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc12));

                    break;

                case 10:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex13);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc13));

                    break;

                case 11:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex14);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc14));

                    break;

                case 12:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex83);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc83));

                    break;


                case 13:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex84);
                    mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc84));

                    break;


               case 14:
                    videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ex85);
                   mToolbar.setTitle(item.text);
                    videoView.start();
                    title.setText(item.text);
                    desc.setText(getString(R.string.ex_desc85));

                    break;

                default:
                    Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    }



