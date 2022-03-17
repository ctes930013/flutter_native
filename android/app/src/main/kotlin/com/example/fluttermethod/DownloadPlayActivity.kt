package com.example.fluttermethod

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import io.flutter.embedding.android.FlutterActivity

class DownloadPlayActivity : BaseActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.download_play)

        val txt = findViewById<TextView>(R.id.txt)
        val next = findViewById<Button>(R.id.next)
        val back = findViewById<Button>(R.id.back)

        //接收上頁傳入的值
        val bundle = intent.extras
        val param = bundle?.getString("param")

        txt.text = param

        //進入下一頁
        next.setOnClickListener{
            val intent = Intent(this, PageActivity::class.java)
            startActivity(intent)
        }

        //返回flutter
        back.setOnClickListener{
            finish()
        }
    }
}