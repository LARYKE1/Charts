package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartDemo extends AppCompatActivity {

    BarChart bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart_demo);

        bar=(BarChart) findViewById(R.id.idBarChart);
        ArrayList<BarEntry> barEntries=new ArrayList<>();
        barEntries.add(new BarEntry(2010,1000));
        barEntries.add(new BarEntry(2011,2000));
        barEntries.add(new BarEntry(2012,2500));
        barEntries.add(new BarEntry(2050,1700));
        barEntries.add(new BarEntry(2030,1900));
        barEntries.add(new BarEntry(2002,1300));
        barEntries.add(new BarEntry(2016,1002));
        barEntries.add(new BarEntry(2019,1890));
        barEntries.add(new BarEntry(2013,1030));

        BarDataSet dataSet=new BarDataSet(barEntries,"Report Analysis");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(18f);


        BarData barData=new BarData(dataSet);
        bar.setFitBars(true);
        bar.setData(barData);
        bar.getDescription().setText("Annual Report of Sales");
        bar.animateY(2000);

    }
}