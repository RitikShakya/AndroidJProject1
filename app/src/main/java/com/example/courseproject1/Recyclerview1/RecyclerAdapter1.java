package com.example.courseproject1.Recyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.courseproject1.R;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerAdapter1.CountryViewHolder> {

    Context content ;
    private ArrayList<String> countries;
    private ArrayList<String> details ;

    public RecyclerAdapter1(Context content, ArrayList<String> countries, ArrayList<String> details) {
        this.content = content;
        this.countries = countries;
        this.details = details;

    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_card_view,parent,false);


        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        holder.countriesname.setText(countries.get(position));
        holder.countriesdetail.setText(details.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(content,"you selected " + holder.countriesname.getText().toString(), Toast.LENGTH_SHORT ).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


    public class CountryViewHolder extends  RecyclerView.ViewHolder{

        TextView countriesname,countriesdetail;
        CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            countriesname = itemView.findViewById(R.id.countryname);
            countriesdetail = itemView.findViewById(R.id.countrydetails);
            cardView = itemView.findViewById(R.id.cardView1);


        }
    }


}
