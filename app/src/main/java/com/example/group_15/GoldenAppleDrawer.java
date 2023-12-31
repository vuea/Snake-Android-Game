package com.example.group_15;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class GoldenAppleDrawer {
    private Point location;
    private int size;
    private Bitmap bitmapGoldenApple;

    public GoldenAppleDrawer(Point location, int size, Bitmap bitmapGoldenApple) {
        this.location = location;
        this.size = size;
        this.bitmapGoldenApple = bitmapGoldenApple;
    }

    public void drawGoldenApple(Canvas canvas, Paint paint) {
        canvas.drawBitmap(bitmapGoldenApple, location.x * size, location.y * size, paint);
    }
}
