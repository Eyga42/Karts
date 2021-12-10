package com.example.karts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClickgoMain3(view: View) {
        val main3 = Intent(this, MainActivity3::class.java)
        startActivity(main3)
    }
}