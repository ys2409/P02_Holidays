package com.myapplicationdev.android.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {
    private ArrayList<Holidays> hols;
    private Context context;
    private TextView tvHolidayName;
    private ImageView ivHolidayIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects){
        super(context, resource, objects);
        this.context = context;
        hols = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvHolidayName = (TextView) rowView.findViewById(R.id.tvHol1);
        ivHolidayIcon = (ImageView) rowView.findViewById(R.id.ivHol1);

        //Module currentMod = Module.get(position);

        Holidays currentHols = hols.get(position);
        tvHolidayName.setText(currentHols.getHolName());

        if(currentHols.isHolIcon()) {
            ivHolidayIcon.setImageResource(R.drawable.hols);
        } else {
            ivHolidayIcon.setImageResource(R.drawable.nonhols);
        }

        return rowView;
    }
}
