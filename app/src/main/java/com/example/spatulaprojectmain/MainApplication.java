package com.example.spatulaprojectmain;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {

    //applicationContext를 바인딩한다.
    private static Context applicationContext;
    //application를  전역적으로 제공할 메소드.
    public static Context getAppContext(){
        return applicationContext;
    }
    //앱이 최초 실행될 떄 호출한다.
    @Override
    public void onCreate(){
        super.onCreate();
        //static으로 선언된 applicationContext에 현재 실행중인
        // application로 바인딩한다.
        applicationContext=getApplicationContext();

    }


}