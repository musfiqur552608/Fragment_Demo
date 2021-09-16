package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ExampleFragment fragment = ExampleFragment.newInstence("Example Text ", 123);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}