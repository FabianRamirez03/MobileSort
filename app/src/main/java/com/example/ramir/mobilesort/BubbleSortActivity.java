package com.example.ramir.mobilesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ramir.mobilesort.Lists.SimpleList;
import com.example.ramir.mobilesort.Sort.SortController;
import com.example.ramir.mobilesort.Sort.sortMethods;
import com.example.ramir.mobilesort.draw.Drawer;

public class BubbleSortActivity extends AppCompatActivity {

    private Drawer drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_sort);
        drawer = findViewById(R.id.drawer);  // Setups the Drawer for the bars
    }
    public void goBack(View view){
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
    public void unSort(View view){
        SortController controller = SortController.getInstance();
        controller.unSortList(controller.getNumList());
        drawer.invalidate();
    }
    public void Sort(View view){
        SimpleList numList = SortController.getInstance().getNumList();
        sortMethods.bubbleSort(numList);
        drawer.invalidate();
    }
}
