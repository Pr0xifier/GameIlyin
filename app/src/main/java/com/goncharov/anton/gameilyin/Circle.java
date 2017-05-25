package com.goncharov.anton.gameilyin;

import android.graphics.Canvas;
import android.graphics.Color;

class Circle extends Figure implements Changeable{

    private float radius;

    Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
    }

    //Генерим RGB-цвета случайным образом
    private int getRandom() {
        int a = 0;
        int b = 255;
        return (int) (a + (Math.random() * b));
    }

    @Override
    public void change() {
        int[] colors = new int[3];

        for (int i = 0; i < 3; i++) {
            colors[i] = getRandom();
        }

        //Меняем цвета круга
        paint.setColor(Color.rgb(colors[0], colors[1], colors[2]));

    }
}
