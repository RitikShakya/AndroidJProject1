package com.example.courseproject1.sharedpclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.courseproject1.R;

public class Sharedclass extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    Button button;
    int count = 0;



    SharedPreferences sharedPreferences;
    int value;
    String details;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedclass);

        editText1 = findViewById(R.id.sc_text1);
        editText2 = findViewById(R.id.sc_text2);
        button = findViewById(R.id.sc_btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                button.setText("" +count);
            }
        });
        retrievedata();
    }
    void savedata(){
        sharedPreferences = getSharedPreferences("savedata1", Context.MODE_PRIVATE );

         name = editText1.getText().toString();
         details = editText2.getText().toString();
         //value = button.getText().;

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("name1", name);
        editor.putString("details1", details);
        editor.putInt("value1",count);
        editor.commit();
    }

    void retrievedata(){
        sharedPreferences = getSharedPreferences("savedata1", Context.MODE_PRIVATE);
         name = sharedPreferences.getString("name1", null);
         details = sharedPreferences.getString("details1", null);
         value =sharedPreferences.getInt("value1",0);

         editText1.setText(name);
         editText2.setText(details);
         button.setText(" " + value);
    }

    @Override
    protected void onPause() {

        savedata();
        super.onPause();
    }





//    @Override
//    protected void onResume() {
//        retrievedata();
//        super.onResume();
//    }

}