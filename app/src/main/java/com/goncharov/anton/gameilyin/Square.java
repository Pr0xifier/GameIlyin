package com.goncharov.anton.gameilyin;

import android.graphics.Canvas;

class Square extends Figure implements Changeable {

    private float x2, y2;
    private static int degree;
    private Canvas canvas;

    Square(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw(Canvas canvas) {
        this.canvas = canvas;
    }

    //Генерим угловой поворот
    private int getDegree() {
        degree++;
        return degree;
    }

    @Override
    public void change() {
        float cx = x + (x2 - x) / 2;
        float cy = y + (y2 - y) / 2;
        canvas.rotate(getDegree(), cx, cy);
        canvas.drawRect(x, y, x2, y2, paint);
    }
}
