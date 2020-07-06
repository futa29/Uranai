package com.example.uranai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapHere.setOnClickListener {
            var num = (Math.random() * 6).toInt()

            when(num){
                0 -> ura_text.text ="大吉"
                1 -> ura_text.text ="中吉"
                2 -> ura_text.text ="小吉"
                3 -> ura_text.text ="末吉"
                4 -> ura_text.text ="吉"
                else -> ura_text.text = "凶"

            }

         }
    }



}
