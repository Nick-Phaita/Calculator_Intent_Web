package com.example.second_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn_Calc.setOnClickListener {
            val hesabu = Intent(this,CalculatorActivity::class.java)
            startActivity(hesabu)
        }
        Btn_Intent.setOnClickListener {
            val inten = Intent(this,IntentActivity::class.java)
            startActivity(inten)
        }
        Btn_Web.setOnClickListener {
            val web = Intent(this,WebActivity::class.java)
            startActivity(web)
        }
    }
}