package com.myapplicationdev.android.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHolidayName, tvDate;
    private ImageView ivHol;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

        //Store the arraylist that is passed to this adapter
        holiday = objects;

        //Store Context object as we need to use it later
        this.context = context;
    }

    //Use getView() method that listView will call to get
    // the view object every time listView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the LayoutInflater object to "inflate" the XML file into
        // a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvHolidayName = rowView.findViewById(R.id.tvHolidayName);
        tvDate = rowView.findViewById(R.id.tvDate);
        ivHol = rowView.findViewById(R.id.ivHol);

        

    }
}

