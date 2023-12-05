package com.hfad.widgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import static android.widget.Toast.makeText;

public class ToastTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_test);

        Toast toast = new Toast(this);
        toast.setText("Hello world!");
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}