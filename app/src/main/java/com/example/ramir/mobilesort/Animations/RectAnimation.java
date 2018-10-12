package com.example.ramir.mobilesort.Animations;

import android.graphics.Rect;
import android.util.Log;

import com.example.ramir.mobilesort.Lists.GenericList;
import com.example.ramir.mobilesort.Sort.SortController;

import static android.content.ContentValues.TAG;

public class RectAnimation {

    public static void animate(int i, int j){
        GenericList barList = SortController.getInstance().getBarsList();
        Rect rect1 = (Rect) barList.getByIndex(i).getValue();
        Rect rect2 = (Rect) barList.getByIndex(j).getValue();
        while (rect1.left != rect2.left){
            rect1.left += 3;
            rect2.left -= 3;
        }
        barList.swap(i, j, barList);
        Log.d(TAG, String.valueOf(barList.getByIndex(i)));
        Log.d(TAG, String.valueOf(barList.getByIndex(j)));
    }
}
