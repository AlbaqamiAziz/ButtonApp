package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var num = 0

    private lateinit var numText: TextView
    private lateinit var minus: Button
    private lateinit var plus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numText = findViewById(R.id.Num)
        minus = findViewById(R.id.Minus)
        plus = findViewById(R.id.Plus)

        plus.setOnClickListener {
            updateNumber(true)
        }
        minus.setOnClickListener {
            updateNumber(false)
        }


    }

    private fun updateNumber(add: Boolean){
        if(add){
            num++
        }else{
            num--
        }
        numText.text = num.toString()
        if(num > 0){
            numText.setTextColor(Color.GREEN)
        } else if (num < 0){
            numText.setTextColor(Color.RED)
        }
    }
}