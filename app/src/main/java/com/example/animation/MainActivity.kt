package com.example.animation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        overridePendingTransition(R.anim.slide_in, R.anim.fade_out);

        val btn_for = findViewById<Button>(R.id.forward)

        btn_for.setOnClickListener {
            val intent = Intent(this, ForwardActivity::class.java)
            startActivity(intent)
        }

    }
}