package com.example.calculadora4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun PresionarDigito(view:View){
        val num2: TextView = findViewById(R.id.num2)
        var tvnum2: String = num2.text.toString().toString()
        when (view.id){
            R.id.btn0-> num2.setText(tvnum2+"0")
            R.id.btn1-> num2.setText(tvnum2+"1")
            R.id.btn2-> num2.setText(tvnum2+"2")
            R.id.btn3-> num2.setText(tvnum2+"3")
            R.id.btn4-> num2.setText(tvnum2+"4")
            R.id.btn5-> num2.setText(tvnum2+"5")
            R.id.btn6-> num2.setText(tvnum2+"6")
            R.id.btn7-> num2.setText(tvnum2+"7")
            R.id.btn8-> num2.setText(tvnum2+"8")
            R.id.btn9-> num2.setText(tvnum2+"9")
            R.id.btnpunto-> num2.setText(tvnum2+".")
        }

    }
}
