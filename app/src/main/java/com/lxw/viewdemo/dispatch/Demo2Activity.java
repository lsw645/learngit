package com.lxw.viewdemo.dispatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.lxw.viewdemo.R;

public class Demo2Activity extends AppCompatActivity {

    private static final String TAG = "Demo2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        View viewContainer = findViewById(R.id.sasda);
//        viewContainer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(Demo2Activity.this,"asdada",Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, " Demo2Activity dispatchTouchEvent() ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, " Demo2Activity dispatchTouchEvent() ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, " Demo2Activity dispatchTouchEvent() ACTION_UP" );
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
                Log.d(TAG, " Demo2Activity onTouchEvent() ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, " Demo2Activity onTouchEvent() ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, " Demo2Activity onTouchEvent() ACTION_UP" );
                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }
}
