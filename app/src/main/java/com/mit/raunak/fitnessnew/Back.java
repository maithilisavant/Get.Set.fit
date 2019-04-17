package com.mit.raunak.fitnessnew;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class Back extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Chin-Ups", R.drawable.back1, "@color/black"));
        arrayList.add(new DataModel("Deadlifts", R.drawable.back2, "@color/white"));
        arrayList.add(new DataModel("Lat Pull-Downs", R.drawable.back3,  "@color/white"));
        arrayList.add(new DataModel("Seated Rows", R.drawable.back4,  "@color/white"));
        arrayList.add(new DataModel("One-Arm Dumbell Rows", R.drawable.back5,  "@color/white"));
        arrayList.add(new DataModel("Barbell Shrugs", R.drawable.back6,  "@color/white"));
        arrayList.add(new DataModel("Dumbell Shrugs", R.drawable.back7,  "@color/white"));
        arrayList.add(new DataModel("Back Extensions", R.drawable.back8,  "@color/white"));
        arrayList.add(new DataModel("Bent Over Row", R.drawable.back9,  "@color/white"));
        arrayList.add(new DataModel("Reverse Chinups", R.drawable.back10,  "@color/white"));
        arrayList.add(new DataModel("Bodyweight Superman", R.drawable.back11,  "@color/white"));
        arrayList.add(new DataModel("Dumbells Bent Over Rows", R.drawable.back12,  "@color/white"));
        arrayList.add(new DataModel("Stability Ball Extension", R.drawable.back13,  "@color/white"));
        arrayList.add(new DataModel("Seated Bent Over Row", R.drawable.back14,  "@color/white"));
        arrayList.add(new DataModel("T-Bar Bent Over Row", R.drawable.back15,  "@color/white"));



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
