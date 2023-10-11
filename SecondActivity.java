package com.example.lab1_tsapaev;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String colorText = getIntent().getStringExtra("colorText");

        if (colorText.equals("red")) {
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        } else if (colorText.equals("green")) {
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        } else if (colorText.equals("blue")) {
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        } else {
            getWindow().getDecorView().setBackgroundColor(Color.WHITE);
        }
    }
}
