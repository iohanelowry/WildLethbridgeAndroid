package com.example.wildlethbridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask task = new TimerTask() {
            @Override
            public void run(){
                finish();
                startActivity(new Intent(MainActivity.this, mainEntry.class));
            }
        };
        Timer counter = new Timer();
        counter.schedule(task, 3000);
    }
}