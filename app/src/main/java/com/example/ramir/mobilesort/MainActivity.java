package com.example.ramir.mobilesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AnimationBubble (View view){
        Intent animation = new Intent(this, BubbleAnimation.class);
        startActivity(animation);
    }
    public void AnimationQuick (View view){
        Intent animation = new Intent(this, AnimationActivity.class);
        startActivity(animation);
    }
}
