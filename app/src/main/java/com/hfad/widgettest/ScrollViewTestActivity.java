package com.hfad.widgettest;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;
import static com.hfad.widgettest.R.drawable.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ScrollViewTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_test);

        LinearLayout linearLayout = findViewById(R.id.linearlayout);
        for (int i=0; i<10; i++) {
            linearLayout.addView(createButton(String.valueOf(i)), i);
        }
    }

    private Button createButton(String text) {
        Button v = new Button(getBaseContext());
        v.setId(View.generateViewId());
        v.setText(text);
        v.setTextSize(30);
        v.setLayoutParams(new ViewGroup.LayoutParams(250, 250));
        return v;
    }
}