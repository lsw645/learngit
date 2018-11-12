package com.lxw.viewdemo;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;

public class HandlerActivity extends AppCompatActivity {
    private static final String TAG = "HandlerActivity";
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private ImageView mImageView;
    private Messager msg = null;
    private int result = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
//        mImageView =findViewById(R.id.iv);
//        mHandlerThread = new HandlerThread("");
//        mHandler = new Handler(mHandlerThread.getLooper(), new Handler.Callback() {
//            @Override
//            public boolean handleMessage(android.os.Message msg) {
//                HandlerActivity.this.mImageView.invalidate();;
//                return false;
//            }
//        });
//        test();
//        Integer a = 10;
//        test2(a);
//        System.out.println(a);
//        new AsyncTask<String, Void, Void>() {
//            @Override
//            protected Void doInBackground(String... voids) {
//                return null;
//            }
//        }.execute();
        Object o = new Object();
//        ConstraintLayout constraintLayout = new ConstraintLayout();
        try {
            o.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        o.notifyAll();
        if(msg==null){
            msg = new Messager();
        }
        msg.doWork();
        System.out.println("result" +result);
    }
    private class Messager {
        public Messager(){

        }
        public void doWork(){
            result = result++;

        }
    }

    private void test2(Integer i){
        i = null;
    }

    public  void test(){
        File file = new File(Environment.getExternalStorageDirectory(),"test.txt");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            int bt= inputStream.read();
            Log.d(TAG, "test() returned: " + "b");

        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "test() returned: printStackTrace" );
            return;
        } finally {
            Log.d(TAG, "test() returned: noE " );
        }
    }

}
