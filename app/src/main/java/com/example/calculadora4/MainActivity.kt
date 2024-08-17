package com.example.calculadora4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //0->nada, 1->suma, 2->resta, 3->multiplicacion, 4->divicion
    var oper: Int = 0
    var numero1: Double =0.0
    lateinit var num1: TextView
    lateinit var num2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1= findViewById(R.id.num1)
        num2= findViewById(R.id.num2)
        val btnborrar: Button = findViewById(R.id.btnborrar)
        val btnigual: Button = findViewById(R.id.btnigual)


        btnigual.setOnClickListener {
            var numero2: Double = num2.text.toString().toDouble()
            var resp : Double=0.0

            when(oper){
                1-> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2

            }

            num2.setText(resp.toString())
            num1.setText("")

        }
        btnborrar.setOnClickListener {
            num1.setText("")
            num2.setText("")
            numero1 = 0.0
            oper = 0
        }
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
    fun clicOperacion (view:View){
        numero1 = num2.text.toString(). toDouble()
        var num2_text: String = num2.text.toString()
        num2.setText("")
        when (view.id){
            R.id.btnmas ->{
                num1.setText(num2_text+"+")
                oper = 1
            }
            R.id.btnmenos ->{
                num1.setText(num2_text + "-")
                oper = 2
            }
            R.id.btnpor ->{
                num1.setText(num2_text+"*")
                oper = 3
            }
            R.id.btndividido ->{
                num1.setText(num2_text + "/")
                oper = 4
            }
        }

    }
}
