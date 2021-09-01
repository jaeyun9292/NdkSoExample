package com.example.ndksoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.ndklib.NativeWrapper;

@SuppressWarnings("JavaJniMissingFunction")
public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }

    private native String stringFromJNI();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NativeWrapper nativeapi = new NativeWrapper();

        Log.d("MyNDKTest", stringFromJNI());
        Log.d("MyNDKTest", nativeapi.nativeSum(5,10)+"");
    }
}