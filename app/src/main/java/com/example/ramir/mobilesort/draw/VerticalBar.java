package com.example.ramir.mobilesort.draw;

import android.graphics.Rect;

/**
 * Class that creates Rectangles
 */
public class VerticalBar {

    /**
     * Creates a Rect object
     * @param xPoss initial x position
     * @param yPoss initial y position
     * @param width size of the rect in x
     * @param height size of the rect in -y
     * @return a Rect object
     */
    static AnimatableRectF createBar(int xPoss, int yPoss, int width, int height){
        width += xPoss;
        height = yPoss -height;
        return new AnimatableRectF(xPoss, height, width, yPoss);

    }
}
