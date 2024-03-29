package com.example.paulov.nijyuujugyou;

import android.os.SystemClock;
import android.util.Log;

public class TimeWorker implements Runnable{

    private volatile boolean running;
    private int seconds;

    @Override
    public void run() {
        running=true;

        while(running){
            seconds++;
            Log.i("MyApp","Segundos ="+seconds);
            SystemClock.sleep(1000);
        }
    }

    public void stop(){
        running = false;
    }
}
