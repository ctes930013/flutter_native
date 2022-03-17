package com.example.fluttermethod

import android.os.Bundle
import android.view.WindowManager
import io.flutter.embedding.android.FlutterActivity

abstract class BaseActivity: FlutterActivity()  {

    @Override
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        //禁用截圖
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
    }
}