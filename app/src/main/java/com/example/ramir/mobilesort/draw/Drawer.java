package com.example.ramir.mobilesort.draw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Class that manage the drawing of the VerticalBars
 */
public class Drawer extends View {


    public Drawer(Context context) {
        super(context);
        init(null);
    }

    public Drawer(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public Drawer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public Drawer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){

    }

    @Override
    protected void onDraw(Canvas canvas){
        // Draw a rectangle in the dimensions given
        Rect rect = VerticalBar.drawBar(10, 10, 100, 100);
        @SuppressLint("DrawAllocation") Paint color = new Paint();
        color.setColor(Color.GREEN);
        canvas.drawRect(rect, color);
    }
}
