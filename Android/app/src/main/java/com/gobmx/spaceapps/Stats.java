package com.gobmx.spaceapps;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Stats extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(2008, 1000),
                new DataPoint(2012, 1300),
                new DataPoint(2016, 1800),
                new DataPoint(2018, 1900),
                new DataPoint(2020, 2058)
        });
        graph.addSeries(series);

        GraphView graph2 = (GraphView) findViewById(R.id.graph2);
        BarGraphSeries<DataPoint> series2 = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(2030, 8370),
                new DataPoint(2035, 15000),
                new DataPoint(2040, 22600),
                new DataPoint(2045, 27400),
                new DataPoint(2050, 31700)
        });
        graph2.addSeries(series2);

        // styling
        series2.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
            }
        });

        series2.setSpacing(50);

// draw values on top
        series2.setDrawValuesOnTop(true);
        series2.setValuesOnTopColor(Color.RED);
//series.setValuesOnTopSize(50);
    }
}