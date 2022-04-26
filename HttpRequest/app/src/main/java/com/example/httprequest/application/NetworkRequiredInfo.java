package com.example.httprequest.application;

import android.app.Application;

import com.llw.network.BuildConfig;
import com.llw.network.INetworkRequiredInfo;

public class NetworkRequiredInfo implements INetworkRequiredInfo {
    private Application application;

    public NetworkRequiredInfo(Application application){
        this.application = application;
    }

    /**
     * 版本名
     */
    @Override
    public String getAppVersionName() {
//        return BuildConfig.VERSION_NAME;
        return "1.0";
    }
    /**
     * 版本号
     */
    @Override
    public String getAppVersionCode() {
        //return String.valueOf(BuildConfig.VERSION_CODE);
        return "1";
    }

    /**
     * 是否为debug
     */
    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    /**
     * 应用全局上下文
     */
    @Override
    public Application getApplicationContext() {
        return application;
    }
}
