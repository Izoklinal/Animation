package com.example.animation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForwardActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forward)
        overridePendingTransition(R.anim.slide_in, R.anim.fade_out);

        val animAlpha: Animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
        val btn_hide = findViewById<Button>(R.id.btn_hide)

        btn_hide.setOnClickListener(View.OnClickListener {
            it.startAnimation(animAlpha)
        })

        val animRotate: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val btn_rotate = findViewById<Button>(R.id.btn_rotate)

        btn_rotate.setOnClickListener(View.OnClickListener {
            it.startAnimation(animRotate)
        })

        val animBig: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)
        val btn_big = findViewById<Button>(R.id.btn_big)

        btn_big.setOnClickListener(View.OnClickListener {
            it.startAnimation(animBig)
        })

        val animMove: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_translate)
        val btn_ride = findViewById<Button>(R.id.btn_ride)

        btn_ride.setOnClickListener(View.OnClickListener {
            it.startAnimation(animMove)
        })

        val animSmall: Animation = AnimationUtils.loadAnimation(this, R.anim.scale_small)
        val btn_small = findViewById<Button>(R.id.btn_small)

        btn_small.setOnClickListener(View.OnClickListener {
            it.startAnimation(animSmall)
        })
    }
}