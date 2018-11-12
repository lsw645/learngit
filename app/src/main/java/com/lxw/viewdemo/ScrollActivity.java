package com.lxw.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ScrollActivity extends AppCompatActivity {

    private static final String TAG = ScrollActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        final View view = findViewById(R.id.tv);

        view.post(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "run() returned: srollX: " +view.getScrollX()+" scrollY: "+view.getScrollY());
                view.scrollBy(-2000, 600);
                Log.d(TAG, "run2() returned: srollX: " +view.getScrollX()+" scrollY: "+view.getScrollY());
            }
        });


    }
}
