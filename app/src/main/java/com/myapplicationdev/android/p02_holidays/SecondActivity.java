package com.myapplicationdev.android.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHol1;
    ArrayList<Holidays> alHol1;
    HolidayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvHol);
        tvHol1 = (TextView) findViewById(R.id.tvHol);

        Intent i = getIntent();
        String message = i.getStringExtra("type");
        tvHol1.setText(message);

        alHol1 = new ArrayList<Holidays>();
        alHol1.add(new Holidays("New Year's Day","1 Jan 2017",true));
        alHol1.add(new Holidays("Labour Day","1 May 2017", false));
        aa = new HolidayAdapter(this, R.layout.row, alHol1);

        lv.setAdapter(aa);





    }
}
