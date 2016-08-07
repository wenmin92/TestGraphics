package com.linlang.testgraphics;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SurfaceTest extends SurfaceView implements SurfaceHolder.Callback{

    public SurfaceTest(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
