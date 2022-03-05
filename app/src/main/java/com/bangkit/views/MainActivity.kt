package com.bangkit.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCustomView: Button = findViewById(R.id.btn_custom_view)
        btnCustomView.setOnClickListener{
            val moveToCustomView = Intent(this@MainActivity,CustomView::class.java)
            startActivity(moveToCustomView)
        }
    }
}