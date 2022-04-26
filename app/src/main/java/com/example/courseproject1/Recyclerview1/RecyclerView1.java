package com.example.courseproject1.Recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.courseproject1.R;

import java.util.ArrayList;

public class RecyclerView1 extends AppCompatActivity {

    BroadCaster1 broadCaster1 = new BroadCaster1();

    RecyclerView recyclerView;
    CardView cardView;
    private ArrayList<String> countries = new ArrayList<>();
    private ArrayList<String> details = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.recycleview1);
        //cardView = findViewById(R.id.cardView1);

        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerView1.this));


        countries.add("India");
        countries.add("Srilanka");
        countries.add("Nepal");

        details.add("bharat");
        details.add("lankam");
        details.add("budha");

        RecyclerAdapter1 recyclerA = new RecyclerAdapter1(this, countries, details);
        recyclerView.setAdapter(recyclerA);




    }

    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(broadCaster1,filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.unregisterReceiver(broadCaster1);
    }
}