package com.lgh.zujianapplication;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hjq.toast.ToastUtils;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();


        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);

        ToastUtils.init(this);
    }
}
