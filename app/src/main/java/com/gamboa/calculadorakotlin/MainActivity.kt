package com.gamboa.calculadorakotlin

import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity;
import android.text.Editable
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun getNum1(): Double {
            val input1 = number1.text

            if (input1.length <= 0) {
                return 0.0
            } else {
                return (input1.toString()).toDouble()
            }
        }

        fun getNum2(): Double {
            val input2 = number2.text

            if (input2.length <= 0) {
                return 0.0
            } else {
                return (input2.toString()).toDouble()
            }
        }

        sumButton.setOnClickListener {
            expressionType.text = "+"
            result.text = (getNum1() + getNum2()).toString()
        }

        subButton.setOnClickListener {
            expressionType.text = "-"
            result.text = (getNum1() - getNum2()).toString()
        }

        splitButton.setOnClickListener {
            expressionType.text = "/"
            result.text = (getNum1() / getNum2()).toString()
        }

        multiplyButton.setOnClickListener {
            expressionType.text = "x"
            result.text = (getNum1() * getNum2()).toString()
        }

        clearButton.setOnClickListener {
            number1.text = null
            number2.text = null
            result.text = null
        }

    }
}
