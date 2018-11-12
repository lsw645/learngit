package com.lxw.viewdemo.widget;

import android.content.Context;
import android.view.View;

/**
 * <pre>
 *     author : lxw
 *     e-mail : lsw@tairunmh.com
 *     time   : 2018/09/04
 *     desc   :
 * </pre>
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        invalidate();
    }
}
