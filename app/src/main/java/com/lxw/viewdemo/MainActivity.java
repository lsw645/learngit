package com.lxw.viewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGestureDetector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                Log.d(TAG, "onDown() returned: ");
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {
                Log.d(TAG, "onShowPress() returned: ");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                Log.d(TAG, "onSingleTapUp() returned: " + true);
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                Log.d(TAG, "onScroll() returned: " + true);
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                Log.d(TAG, "onLongPress() returned: ");

            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Log.d(TAG, "onFling() returned: " + true);
                return false;
            }
        });
        mGestureDetector.setIsLongpressEnabled(false);
        mGestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() {
            @Override
            public boolean onSingleTapConfirmed(MotionEvent e) {
                Log.d(TAG, "onSingleTapConfirmed() returned: " + true);
                return false;
            }

            @Override
            public boolean onDoubleTap(MotionEvent e) {
                Log.d(TAG, "onDoubleTap() returned: " + true);
                return false;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent e) {
                Log.d(TAG, "onDoubleTapEvent() returned: " + true);
                return false;
            }
        });
getWindowManager();

//        final TextView tv = findViewById(R.id.textView);
//        tv.post(new Runnable() {
//            @Override
//            public void run() {
//                tv.setTranslationX(200);
//                Log.d(TAG, "left: " + tv.getLeft() + " right: " + tv.getRight());
//                Log.d(TAG, "x:  " + tv.getX());
//                Log.d(TAG, "translation: " + tv.getTranslationX());
//                int scaledTouchSlop = ViewConfiguration.get(MainActivity.this).getScaledTouchSlop();
//                Log.d(TAG, "scaledTouchSlop   " + scaledTouchSlop + "       ");
//            }
//        });
//        tv.setOnContextClickListener(new View.OnContextClickListener() {
//            @Override
//            public boolean onContextClick(View v) {
//                return false;
//            }
//        });

    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        return mGestureDetector.onTouchEvent(event);
//    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
