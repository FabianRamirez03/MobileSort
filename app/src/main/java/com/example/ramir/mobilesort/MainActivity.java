package com.example.ramir.mobilesort;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.ramir.mobilesort.Sort.SortController;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SortController.init(10);
        textView = (TextView) findViewById(R.id.textView4);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(30);
        seekBar.setMin(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("" + progress);
                SortController.getInstance().setNumListLen(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
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
