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

import com.example.ramir.mobilesort.Lists.SimpleList;
import com.example.ramir.mobilesort.Sort.SortController;

/**
 * Class that manage the drawing of the VerticalBars
 */
public class Drawer extends View {

    private SortController controller = SortController.getInstance();
    private Paint color;
    private Canvas canvas;

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
        @SuppressLint("DrawAllocation") Paint color = new Paint();
        color.setColor(Color.GREEN);
        this.canvas = canvas;
        this.color = color;
        draw_bars();
    }

    public void draw_bars(){
        draw_bars(canvas, color);
    }

    private void draw_bars(Canvas canvas, Paint color){
        SimpleList numList = controller.getNumList();
        int len = numList.getLarge();
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int xOffset = width / len;
        int xPoss =  50;
        int yPoss =  height - 20;

        for (int i = 0; i < len; i++){
            int rectHeight = numList.getByIndex(i).getValue() * height / controller.getMaxNum();
            Rect rect = VerticalBar.createBar(xPoss, yPoss, 20, rectHeight);
            xPoss += xOffset;
            //controller.getBarsList().addAtEnd(rect);
            canvas.drawRect(rect, color);
        }
    }
}
