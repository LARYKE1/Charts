package com.example.charts;

import static com.github.mikephil.charting.utils.ColorTemplate.COLORFUL_COLORS;
import static com.github.mikephil.charting.utils.ColorTemplate.colorWithAlpha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartDemo extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart_demo);

        pieChart=(PieChart) findViewById(R.id.idPieChart);

        ArrayList<PieEntry> pieEntries=new ArrayList<>();

        pieEntries.add(new PieEntry(32,"Quarter 1"));
        pieEntries.add(new PieEntry(13,"Quarter 2"));
        pieEntries.add(new PieEntry(23,"Quarter 3"));
        pieEntries.add(new PieEntry(54,"Quarter 4"));

        PieDataSet pieDataSet=new PieDataSet(pieEntries,"Pie Chart Record");
        pieDataSet.setColors(COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(22f);

        PieData pieData=new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(true);
        pieChart.setCenterText("Quarterly Revenue");
        pieChart.animate();
    }
}