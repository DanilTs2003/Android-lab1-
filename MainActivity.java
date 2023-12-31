package com.example.lab1_tsapaev;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.colorEditText);

        Button changeColorButton = findViewById(R.id.startButton);
        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorText = editText.getText().toString().toLowerCase();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("colorText", colorText);
                startActivity(intent);
            }
        });
    }
}

