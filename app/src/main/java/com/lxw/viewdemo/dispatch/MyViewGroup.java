package com.lxw.viewdemo.dispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * <pre>
 *     author : lxw
 *     e-mail : lsw@tairunmh.com
 *     time   : 2018/09/13
 *     desc   :
 * </pre>
 */
public class MyViewGroup extends FrameLayout {
    private static final String TAG = "ContainerGroup";

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "onInterceptTouchEvent() ACTION_DOWN");
                return true;
//                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "onInterceptTouchEvent() ACTION_MOVE");
//                break;
                return true;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "onInterceptTouchEvent() ACTION_UP");
                break;
            default:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, " container dispatchTouchEvent() ACTION_DOWN");
//                return true;
                            break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, " container dispatchTouchEvent() ACTION_MOVE");
//                return true;
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, " container dispatchTouchEvent() ACTION_UP");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, " container onTouchEvent() ACTION_DOWN");
//                return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, " container onTouchEvent() ACTION_MOVE");
//                return true;
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, " container onTouchEvent() ACTION_UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }
}
