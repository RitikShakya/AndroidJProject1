package com.example.courseproject1.gridview1;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.courseproject1.R;

import java.util.ArrayList;

public class GridviewAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> name = new java.util.ArrayList<>();

    public GridviewAdapter(Context context, ArrayList<String> name) {
        this.context = context;
        this.name = name;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View cview, ViewGroup viewGroup) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_content,viewGroup,false);

        ImageView imageView = view.findViewById(R.id.imageViewgrid);
        TextView textView = view.findViewById(R.id.textViewgrid);

        textView.setText(name.get(i));

        return view;
    }
}
