package com.kingwilliamd.drawingonacanvas;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;

public class MainActivity extends ActionBarActivity {

    SurfaceView drawingSurface;
    int tapsSoFar;
    Canvas canvasToDraw;
    Paint drawPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        canvasToDraw = new Canvas();
        drawingSurface = (SurfaceView) findViewById(R.id.surface);
        drawPaint = new Paint();
        drawPaint.setColor(Color.rgb(150,150,100));
        tapsSoFar = 0;


        drawingSurface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (tapsSoFar) {
                    case 0:
                        canvasToDraw.drawCircle(40, 4, 4, drawPaint);
                        drawingSurface.draw(canvasToDraw);
                        tapsSoFar++;
                        break;
                    case 1:
                        canvasToDraw.drawRect(0,50,0,50,drawPaint);
                        drawingSurface.draw(canvasToDraw);
                        tapsSoFar++;
                        break;
                    case 2:
                        tapsSoFar++;
                        break;
                    case 3:
                        tapsSoFar = 0;

                        break;
                }

            } // onClick
        }); // drawingSurface.setOnClickListener
    } // onCreate




}
