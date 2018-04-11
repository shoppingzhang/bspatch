package com.cleverm.bspatchdemo;

/**
 * Created by ricky on 2018/4/8.
 */

public class BsPatch {

    static {
        System.loadLibrary("bspatch");
    }

    /**
     *
     * @param oldApk 旧apk文件路径
     * @param newApk 生成的新apk文件放置的路径
     * @param patch patch文件的路径
     * @return  返回0代表成功
     */
    public static native int bspatch(String oldApk, String newApk, String patch);
}
