package com.example.courseproject1.gridview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;


import com.example.courseproject1.R;

import java.util.ArrayList;

public class GridView1 extends AppCompatActivity {

    GridView gridview;

    ArrayList<String> name = new ArrayList<>();
    //ArrayList<Integer> image = new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view1);

        gridview = findViewById(R.id.gridview);

        name.add("dog");
        name.add("cat");
        name.add("animal3");
        name.add("tiger");
        name.add("fox");
        name.add("cow");





        GridviewAdapter gridadapter1 = new GridviewAdapter(this,name);
        gridview.setAdapter(gridadapter1);




    }
}