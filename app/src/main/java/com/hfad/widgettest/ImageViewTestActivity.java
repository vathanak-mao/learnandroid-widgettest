package com.hfad.widgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_test);

        ImageView photo = findViewById(R.id.imageview);
        int imageId = R.drawable.banana;
        photo.setImageResource(imageId);
        photo.setContentDescription("This is bananas.");
    }
}