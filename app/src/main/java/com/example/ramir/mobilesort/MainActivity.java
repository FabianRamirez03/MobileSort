package com.example.ramir.mobilesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ramir.mobilesort.Sort.SortController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SortController.init(10);
    }

    public void AnimationBubble (View view){
        Intent animation = new Intent(this, BubbleSortActivity.class);
        startActivity(animation);
    }
    public void AnimationQuick (View view){
        Intent animation = new Intent(this, QuickSortActivity.class);
        startActivity(animation);
    }
}
