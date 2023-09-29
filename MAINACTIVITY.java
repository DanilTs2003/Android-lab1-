package com.example.lab1_tsapaev;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MAINACTIVITY extends AppCompatActivity {
    private EditText colorEditText;
    private Button changeColorButton;
    private View colorDisplayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorEditText = findViewById(R.id.colorEditText);
        changeColorButton = findViewById(R.id.changeColorButton);
        colorDisplayView = findViewById(R.id.colorDisplayView);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String color = colorEditText.getText().toString().toLowerCase();

                int backgroundColor = Color.WHITE; // Цвет по умолчанию (белый)

                if ("red".equals(color)) {
                    backgroundColor = Color.RED;
                } else if ("green".equals(color)) {
                    backgroundColor = Color.GREEN;
                } else if ("blue".equals(color)) {
                    backgroundColor = Color.BLUE;
                }

                colorDisplayView.setBackgroundColor(backgroundColor);
            }
        });
    }
}