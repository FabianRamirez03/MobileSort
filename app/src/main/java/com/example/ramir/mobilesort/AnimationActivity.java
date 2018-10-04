package com.example.ramir.mobilesort;

import android.content.Intent;
import android.media.tv.TvView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {

    private static String method;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }

    public void goBack(View view){
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }

    public static void setMethod(String method) {
        AnimationActivity.method = method;
    }




}
