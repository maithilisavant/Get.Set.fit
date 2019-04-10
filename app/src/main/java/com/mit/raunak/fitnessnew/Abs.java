package com.mit.raunak.fitnessnew;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.GridLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class Abs extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Incline Bench Sit-Ups", R.drawable.abs1, "@color/black"));
        arrayList.add(new DataModel("Hanging Leg Raises", R.drawable.abs2, "@color/white"));
        arrayList.add(new DataModel("Dumbell Side Raises", R.drawable.abs3,  "@color/white"));
        arrayList.add(new DataModel("Crunches", R.drawable.abs4,  "@color/white"));
        arrayList.add(new DataModel("Sit-ups", R.drawable.abs5,  "@color/white"));
        arrayList.add(new DataModel("Leg Raises", R.drawable.abs6,  "@color/white"));
        arrayList.add(new DataModel("Flat Bench Lying Leg Raises", R.drawable.abs7,  "@color/white"));
        arrayList.add(new DataModel("Seated JackKnife", R.drawable.abs8,  "@color/white"));
        arrayList.add(new DataModel("Twisting Hip Raise", R.drawable.abs9,  "@color/white"));
        arrayList.add(new DataModel("BodyWeight Crunch", R.drawable.abs10,  "@color/white"));
        arrayList.add(new DataModel("Russian Twist", R.drawable.abs11,  "@color/white"));
        arrayList.add(new DataModel("Side Bridge", R.drawable.abs12,  "@color/white"));
        arrayList.add(new DataModel("Bodyweight Hip Extension", R.drawable.abs13,  "@color/white"));
        arrayList.add(new DataModel("Rotating T Extension", R.drawable.abs14,  "@color/white"));
        arrayList.add(new DataModel("Superman", R.drawable.abs15,  "@color/white"));



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

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();

    }
}
