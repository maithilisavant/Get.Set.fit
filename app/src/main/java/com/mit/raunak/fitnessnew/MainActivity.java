package com.mit.raunak.fitnessnew;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        private TabAdapter adapter;
        private TabLayout tabLayout;
        private ViewPager viewPager;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            viewPager = (ViewPager) findViewById(R.id.viewPager);
            tabLayout = (TabLayout) findViewById(R.id.tabLayout);
            adapter = new TabAdapter(getSupportFragmentManager());
            adapter.addFragment(new Tab1Fragment(), "Home");
            adapter.addFragment(new Tab2Fragment(), "Workout");
            adapter.addFragment(new Tab3Fragment(), "Utility");
            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);
        }
    }

