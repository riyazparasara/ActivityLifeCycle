package com.jecrc.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("JECRC LIFECYCLE", " On Create method call ho rha he");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("JECRC LIFECYCLE", " On Start method call ho rha he");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("JECRC LIFECYCLE", " On Resume method call ho rha he");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("JECRC LIFECYCLE", " On Pause method call ho rha he");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("JECRC LIFECYCLE", " On Stop method call ho rha he");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("JECRC LIFECYCLE", " On Destroy method call ho rha he");
    }

}
