package com.goncharov.anton.gameilyin;

import android.graphics.Canvas;
import android.graphics.Paint;

abstract class Figure {
    protected float x;
    protected float y;
    protected Paint paint;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
        paint = new Paint();
    }

    protected abstract void draw(Canvas canvas);
}
