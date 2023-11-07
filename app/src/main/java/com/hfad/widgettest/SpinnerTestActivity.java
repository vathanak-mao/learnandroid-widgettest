package com.hfad.widgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;

public class SpinnerTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprinner_test);

        Spinner spinner = findViewById(R.id.spinner);
        Log.d(getLocalClassName(), String.valueOf(spinner.getSelectedItem()));
    }
}