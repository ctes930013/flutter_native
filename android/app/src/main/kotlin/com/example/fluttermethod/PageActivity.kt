package com.example.fluttermethod

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PageActivity : BaseActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page)

        val btn = findViewById<Button>(R.id.btn)

        //返回flutter
        btn.setOnClickListener{
            finish()
        }
    }
}