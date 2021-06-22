package com.example.randomdogassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_first_page.*

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        btn_generate.setOnClickListener{
            val intent = Intent(this@FirstPage, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}