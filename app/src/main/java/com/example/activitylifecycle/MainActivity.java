package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("QQQ", "Activity создано!");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("QQQ", "Activity стартануло!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("QQQ", "Activity перезапущено!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("QQQ", "Activity в фокусе!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("QQQ", "Activity на паузе!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("QQQ", "Activity остановлено!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("QQQ", "Activity уничтожено!");
    }
}