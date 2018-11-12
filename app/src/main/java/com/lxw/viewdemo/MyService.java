package com.lxw.viewdemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
//        throw new UnsupportedOperationException("Not yet implemented");
    return new MyBinder();
    }


    private class MyBinder extends Binder{
        public String haha(){
            return "a";
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(){
            @Override
            public void run() {

            }
        }.start();


        return super.onStartCommand(intent, flags, startId);
    }





}
