package com.example.toni.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.util.Log.e;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "ERROR TEST");
        Log.w(TAG, "WARNING TEST");
        Log.d(TAG, "DEBUG TEST" );
        Log.i(TAG, "INFO_TEST");
        Log.wtf(TAG, "FAILURE_TEST");
    }
}
