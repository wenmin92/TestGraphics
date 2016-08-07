package com.linlang.testgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ViewTest extends View {

    private Paint mPaint;

    public ViewTest(Context context) {
        super(context);
        init();
    }

    public ViewTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ViewTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        mPaint.setStrokeCap(Paint.Cap.BUTT);
        mPaint.setStrokeJoin(Paint.Join.MITER);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(0, 0, 500, mPaint);
    }
}
