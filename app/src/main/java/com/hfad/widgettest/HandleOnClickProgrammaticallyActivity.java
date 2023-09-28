package com.hfad.widgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HandleOnClickProgrammaticallyActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handle_on_click_programmatically_test);

        final Button button = findViewById(R.id.yes_button);
        button.setOnClickListener(this);

//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Log.d(this.getClass().getName(), "Yes button clicked!");
//            }
//        });
    }

    public void onClick(View v) {
        Log.d(this.getClass().getName(), "Yes button clicked");
    }
}