package com.example.ramir.mobilesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ramir.mobilesort.draw.Drawer;

public class QuickSortActivity extends AppCompatActivity {

    private static String method;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_sort);
        new Drawer(this); // Setups the Drawer for the bars
    }

    public void goBack(View view){
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }

    public static void setMethod(String method) {
        QuickSortActivity.method = method;
    }




}
