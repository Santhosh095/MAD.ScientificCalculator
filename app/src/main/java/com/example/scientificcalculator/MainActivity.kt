package com.example.scientificcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1h: Button = findViewById(R.id.button1h)
        val btn2h: Button = findViewById(R.id.button2h)
        val btn3h: Button = findViewById(R.id.button3h)

        btn1h.setOnClickListener {
            val intent1h = Intent(this, ArithmeticOperations::class.java)
            startActivity(intent1h)
        }
        btn2h.setOnClickListener {
            val intent2h = Intent(this, TrigonometryOperations::class.java)
            startActivity(intent2h)
        }
        btn3h.setOnClickListener {
            val intent3h = Intent(this, AdvancedMathOperations::class.java)
            startActivity(intent3h)
        }
    }
}