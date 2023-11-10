package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.PieDataSet;

public class MainActivity extends AppCompatActivity {

    private Button btnbar,btnPie,btnLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbar=findViewById(R.id.btnBar);
        btnPie=findViewById(R.id.btnPie);
        btnLine=findViewById(R.id.btnLine);

        btnbar.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this, BarChartDemo.class);
            startActivity(intent);
        });

        btnPie.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this, PieChartDemo.class);
            startActivity(intent);
        });

        btnLine.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,LineChartDemo.class);
            startActivity(intent);
        });


    }
}