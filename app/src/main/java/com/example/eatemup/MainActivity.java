package com.example.eatemup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private Button Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity_after_tap_start();
            }
        });

        Settings = (Button) findViewById(R.id.Settings);
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity_after_tap_settings();
            }
        });
    }


    public void open_activity_after_tap_start(){
        Intent intent = new Intent(this, After_Tap_Start.class);
        startActivity(intent);
    }

    public void open_activity_after_tap_settings(){
        Intent intent = new Intent(this, After_Tap_Settings.class);
        startActivity(intent);
    }
}
