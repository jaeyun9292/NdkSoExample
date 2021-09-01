package com.example.ndklib;

public class NativeWrapper {
    static {

        System.loadLibrary("ndklib");

    }
    public static native int nativeSum(int a, int b);
}
