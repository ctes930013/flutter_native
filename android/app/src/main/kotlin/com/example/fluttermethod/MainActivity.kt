package com.example.fluttermethod

import android.content.Intent
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: BaseActivity() {

    private val CHANNEL = "flutter/helper";
    @Override
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        //監聽channel及函式
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler{
            call, result ->
            when{
                call.method.equals("download") ->{
                    //接收flutter傳入的參數
                    val param = call.arguments as String
                    val intent = Intent(this@MainActivity, DownloadPlayActivity::class.java)
                    intent.putExtra("param", param)
                    startActivity(intent)
                    result.success(param)
                }
            }
        }
    }
}
