package com.example.courseproject1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

//import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class Projectstart extends AppCompatActivity {

    TextView textview;
    Button button;
    Spinner spinner;

    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);
        button = findViewById(R.id.button1);
        spinner = findViewById(R.id.spinner1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showdialogue();
            }
        });

        adapter = ArrayAdapter.createFromResource(this,R.array.mycountries , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String country = adapterView.getSelectedItem().toString();

                textview.setText(country);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

            private void showdialogue() {

                AlertDialog.Builder alert = new AlertDialog.Builder(this);

                alert.setTitle("delete").setMessage("do wou want to delete").setNegativeButton("no ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();

                    }
                }).setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        textview.setText("");

                    }
                }).show();

                alert.create();


            }





}