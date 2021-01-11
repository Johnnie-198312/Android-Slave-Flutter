package com.john.android_slave_flutter;

import androidx.appcompat.app.AppCompatActivity;
import io.flutter.embedding.android.FlutterActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(FlutterActivity.createDefaultIntent(this));


    }
}