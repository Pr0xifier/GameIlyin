package com.goncharov.anton.gameilyin;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

class Control extends View {

    private Circle circle;
    private Square square;
    private Picture picture;

    Control(Context context) {
        super(context);
        circle = new Circle(120, 120, 100);
        square = new Square(500, 100, 650, 250);
        picture = new Picture(300, 300, context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        circle.draw(canvas);
        circle.change();

        picture.draw(canvas);

        square.draw(canvas);
        square.change();

        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        if (picture != null) {
            picture.touch(x, y);
        }
        return false;
    }

}
