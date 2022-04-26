package com.example.courseproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class listView2 extends AppCompatActivity {


    android.widget.ListView listView;
    String countries[];
    ArrayAdapter<String> arrayitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview1);
        countries = getResources().getStringArray(R.array.countrylistview);
        //arrayitem= ArrayAdapter.createFromResource(this,R.array.countrylistview, android.R.layout.simple_list_item_1 );
        arrayitem = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);
        listView.setAdapter(arrayitem);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String country_name = parent.getItemAtPosition(position).toString();

                 Toast.makeText(getApplicationContext(), "you selected" + country_name , Toast.LENGTH_SHORT).show();
            }
        });


    }
}