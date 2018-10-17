package com.example.ramir.mobilesort.Animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Log;

import com.example.ramir.mobilesort.Lists.GenericList;
import com.example.ramir.mobilesort.Sort.SortController;
import com.example.ramir.mobilesort.draw.AnimatableRectF;

import static android.content.ContentValues.TAG;

public class RectAnimation {

    public static void animate(int i, int j){
        GenericList barList = SortController.getInstance().getBarsList();
        AnimatableRectF rect1 = (AnimatableRectF) barList.getByIndex(i).getValue();
        AnimatableRectF rect2 = (AnimatableRectF) barList.getByIndex(j).getValue();
        float pos2 = rect2.left;
        float moveX = 3.00f;
        while (rect1.left < pos2){

            ObjectAnimator animationR1 = ObjectAnimator.ofFloat(rect1, "left",rect1.left,  rect1.left+moveX);
            ObjectAnimator animationR2 = ObjectAnimator.ofFloat(rect2, "left",rect2.left,  rect2.left-moveX);
            playedTogether(animationR1, animationR2);

            rect1.left += moveX;
            rect2.left -= moveX;
        }

        barList.swap(i, j, barList);
        //Log.d(TAG, String.valueOf(barList.getByIndex(i)));
        //Log.d(TAG, String.valueOf(barList.getByIndex(j)));
    }
    private static void playedTogether(ObjectAnimator a1, ObjectAnimator a2){
        AnimatorSet set = new AnimatorSet();
        set.playTogether(a1, a2);
        set.setDuration(1000).start();
    }
}
