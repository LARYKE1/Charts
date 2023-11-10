package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class LineChartDemo extends AppCompatActivity {

    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart_demo);

        lineChart=(LineChart) findViewById(R.id.idLineChart);
        ArrayList<Entry> lineChartArray= new ArrayList<>();

        lineChartArray.add(new Entry(10,18));
        lineChartArray.add(new Entry(15,19));
        lineChartArray.add(new Entry(10,80));
        lineChartArray.add(new Entry(150,80));
        lineChartArray.add(new Entry(500,130));
        lineChartArray.add(new Entry(50,90));

        LineDataSet dataSet=new LineDataSet(lineChartArray,"Line Chart fun");
        dataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(20f);

        LineData lineData=new LineData(dataSet);
        lineChart.setData(lineData);
        lineChart.animateY(2000);




    }
}