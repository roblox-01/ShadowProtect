package com.shadowprotect;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView resultText;
    Button scanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.resultText);
        scanButton = findViewById(R.id.scanBtn);
        scanButton.setOnClickListener(v -> {
            resultText.setText("Scanning...");
            new Scanner(resultText).execute();
        });
    }
}