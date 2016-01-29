package com.hfad.workout;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private WorkoutDetailFragment fragDetail;
    private Fragment fragList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();

        //fragDetail =  (WorkoutDetailFragment)fragmentManager.findFragmentById(R.id.frag_detail);
        fragList = fragmentManager.findFragmentById(R.id.frag_list);
    }
}
