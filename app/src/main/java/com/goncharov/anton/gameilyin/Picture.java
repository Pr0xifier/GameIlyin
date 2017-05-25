package com.goncharov.anton.gameilyin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

class Picture extends Figure implements Touchable {

    private Context context;
    private int picID;
    private Bitmap bitmap;

    Picture(float x, float y, Context context) {
        super(x, y);
        this.context = context;
        picID = R.drawable.tarakan_icon;
    }

    @Override
    public void draw(Canvas canvas) {
        bitmap = BitmapFactory.decodeResource(context.getResources(), picID);
        canvas.drawBitmap(bitmap, x, y, paint);
    }

    @Override
    public void touch(float x, float y) {
        this.x = x;
        this.y = y;
    }

}
