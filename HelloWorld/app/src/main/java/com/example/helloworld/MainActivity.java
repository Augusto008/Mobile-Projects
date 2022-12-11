package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(view -> {
            Snackbar.make(view, "Example of Snack bar", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            Toast.makeText(getApplicationContext(), "Example of Toast", Toast.LENGTH_SHORT).show();
        });
    }
}