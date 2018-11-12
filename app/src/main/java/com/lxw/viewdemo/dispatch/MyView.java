package com.lxw.viewdemo.dispatch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * <pre>
 *     author : lxw
 *     e-mail : lsw@tairunmh.com
 *     time   : 2018/09/13
 *     desc   :
 * </pre>
 */
public class MyView extends View {
    private static final String TAG = "ChildView";

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, " MyView dispatchTouchEvent() ACTION_DOWN");
//               return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, " MyView dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, " MyView dispatchTouchEvent() ACTION_UP");
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
                Log.d(TAG, " MyView onTouchEvent() ACTION_DOWN");
                break;
//                return  true;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, " MyView onTouchEvent() ACTION_MOVE");
//              return true;
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, " MyView onTouchEvent() ACTION_UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }
}
