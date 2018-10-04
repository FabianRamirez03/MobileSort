package com.example.ramir.mobilesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BubbleAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_animation);
    }
    public void goBack(View view){
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
}
