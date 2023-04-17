package com.example.calcnjambiintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var tv_answer: TextView
    lateinit var edt_firstnumber: EditText
    lateinit var buttonsub: Button
    lateinit var buttonadd: Button
    lateinit var buttondivide: Button
    lateinit var edt_secondnumber: EditText
    lateinit var buttonmultiply: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        tv_answer = findViewById(R.id.txt_answer)
        edt_firstnumber = findViewById(R.id.edt_firstnum)
        buttonsub = findViewById(R.id.button_subtract)
        buttonadd = findViewById(R.id.button_addition)
        buttondivide = findViewById(R.id.btn_divide)
        edt_secondnumber = findViewById(R.id.edt_snum)
        buttonmultiply = findViewById(R.id.btn_multiply)

        buttonsub.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                tv_answer.text = "Please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_answer.text = answer.toString()
            }
            buttonadd.setOnClickListener {
                var myfirstnumber = edt_firstnumber.text.toString()
                var mysecondnumber = edt_secondnumber.text.toString()
                if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                    tv_answer.text = "Please fill all the inputs"
                } else {
                    var answer = myfirstnumber.toDouble() +  mysecondnumber.toDouble()
                    tv_answer.text = answer.toString()
                }
            }
            buttondivide.setOnClickListener {
                var myfirstnumber = edt_firstnumber.text.toString()
                var mysecondnumber = edt_secondnumber.text.toString()
                if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                    tv_answer.text = "Please fill all the inputs"
                } else {
                    var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                    tv_answer.text = answer.toString()
                }
            }
            buttonmultiply.setOnClickListener {
                var myfirstnumber = edt_firstnumber.text.toString()
                var mysecondnumber = edt_secondnumber.text.toString()
                if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                    tv_answer.text = "Please fill all the inputs"
                } else {
                    var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                    tv_answer.text = answer.toString()
                }
            }
        }
    }
}