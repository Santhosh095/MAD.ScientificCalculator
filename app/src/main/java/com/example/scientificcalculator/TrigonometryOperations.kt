package com.example.scientificcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import android.widget.RadioButton
//import android.widget.RadioGroup
//import android.widget.Toast
import android.widget.TextView
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan

class TrigonometryOperations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trigonometry_operations)

        val num1: EditText = findViewById(R.id.editTextNumber2)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val resetbtn: Button = findViewById(R.id.button)
        val sol: TextView = findViewById(R.id.textView4)
//        val radiogrp: RadioGroup = findViewById(R.id.radiogrp)
        val btn5: Button = findViewById(R.id.button5)

        btn1.setOnClickListener {
//            val selectbtn: Int = radiogrp.checkedRadioButtonId
//            val ans: RadioButton = findViewById(selectbtn)
//            Toast.makeText(this,ans.text,Toast.LENGTH_SHORT).show()
            val x = num1.text.toString().toInt().toDouble()
            val sine = sin(Math.toRadians(x))
            sol.text = sine.toString()
        }
        btn2.setOnClickListener {
            val x = num1.text.toString().toInt().toDouble()
            val cosine = cos(Math.toRadians(x))
            sol.text = cosine.toString()
        }
        btn3.setOnClickListener {
            val x = num1.text.toString().toInt().toDouble()
            val tan = tan(Math.toRadians(x))
            sol.text = tan.toString()
        }
        btn5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        resetbtn.setOnClickListener {
            sol.text = ""
        }
//        val selectbtn: Int = radiogrp.checkedRadioButtonId
//        val ans: RadioButton = findViewById(selectbtn)
//        Toast.makeText(this,ans.text,Toast.LENGTH_SHORT).show()
    }
}