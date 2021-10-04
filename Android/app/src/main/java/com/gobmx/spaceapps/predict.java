package com.gobmx.spaceapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class predict extends AppCompatActivity {
    String[] años = {"1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
    Spinner spinnerAños;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);
        spinnerAños = findViewById(R.id.spinnerAños);


        ArrayAdapter adapter2 = new ArrayAdapter<>(getBaseContext(), R.layout.spinner_item, años);
        adapter2.setDropDownViewResource(R.layout.spinner_dropdown);
        spinnerAños.setAdapter(adapter2);
    }
}