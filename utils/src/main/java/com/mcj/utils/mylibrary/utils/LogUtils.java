package com.mcj.utils.mylibrary.utils;

import android.util.Log;

/**
 * 创建日期：2018/3/27 14:15
 * 作者： Mao Chunjiang
 * 文件名称： LogUtils
 * 类说明：LogUtils
 */
public class LogUtils {
    private static final boolean DEBUG = true;// 发布的时候修改为false

    public static void Loge(String str) {
        if (DEBUG) Log.e("Log.e:", str);
    }

    public static void Logi(String str) {
        if (DEBUG) Log.i("Log.i:", str);
    }

    public static void Logd(String str) {
        if (DEBUG) Log.d("Log.d:", str);
    }

    public static void Logv(String str) {
        if (DEBUG) Log.v("Log.v:", str);
    }
}
