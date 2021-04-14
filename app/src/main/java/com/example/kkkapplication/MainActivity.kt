package com.example.kkkapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _0 = findViewById<Button>(R.id.btn_0)
        val _1 = findViewById<Button>(R.id.btn_1)
        val _2 = findViewById<Button>(R.id.btn_2)
        val _3 = findViewById<Button>(R.id.btn_3)
        val _4 = findViewById<Button>(R.id.btn_4)
        val _5 = findViewById<Button>(R.id.btn_5)
        val _6 = findViewById<Button>(R.id.btn_6)
        val _7 = findViewById<Button>(R.id.btn_7)
        val _8 = findViewById<Button>(R.id.btn_8)
        val _9 = findViewById<Button>(R.id.btn_9)
        val btnPlus = findViewById<Button>(R.id.btn_sum)
        val btnDiv = findViewById<Button>(R.id.btn_div)
        val btnUm = findViewById<Button>(R.id.btn_um)
        val btnMinus = findViewById<Button>(R.id.btn_minus)
        val btnEq = findViewById<Button>(R.id.btn_eq)
        val btnPoin = findViewById<Button>(R.id.btn_point)
        val txt1 = findViewById<TextView>(R.id.txt1)
        val txt2 = findViewById<TextView>(R.id.txt2)
        val txt3 = findViewById<TextView>(R.id.txt3)
        val txt4 = findViewById<TextView>(R.id.txt4)
        val txt5 = findViewById<TextView>(R.id.txt5)

        _0.setOnClickListener {

            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "0"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "0"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }

        }
        _1.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "1"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "1"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }
        }
        _2.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "2"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "2"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }

        }
        _3.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "3"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "3"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: java.lang.Exception) {

            }

        }
        _4.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "4"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "4"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }
        }
        _5.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "5"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "5"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }
        }
        _6.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "6"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "6"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }

        }
        _7.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "7"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "7"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }

        }
        _8.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "8"
                    d = b.toDouble()
                    txt4.text = b.toInt().toString()
                } else {
                    c = "$c" + "8"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }

        }
        _9.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    b = "$b" + "9"
                    d = b.toDouble()
                    txt4.text = b.toDouble().toString()
                } else {
                    c = "$c" + "9"
                    txt1.text = c.toDouble().toString()
                    a = c.toDouble()
                }
            } catch (e: Exception) {

            }
        }
        btnPoin.setOnClickListener {
            try {
                if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                    try{
                        if (txt4.text.isEmpty()) {
                            c = "0" + "."
                            txt4.text = b.toInt().toString()
                            a = c.toDouble()
                        } else {
                            c = "$b" + "."
                            txt4.text = b.toInt().toString()
                            a = b.toDouble()
                        }
                    }
                    catch (e:Exception){
                        Toast.makeText(this, "333333", Toast.LENGTH_LONG).show()
                    }
                } else {
                    try {
                        if (txt1.text.isEmpty()) {
                            c = "0" + "."
                            txt1.text = c.toInt().toString()
                            a = c.toDouble()
                        } else {
                            c = "$b" + "."
                            txt1.text = b.toInt().toString()
                            a = b.toDouble()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(this, "2222", Toast.LENGTH_LONG).show()
                    }
                }
            } catch (e: Exception) {
                Toast.makeText(this, "11111", Toast.LENGTH_LONG).show()
            }
        }
        btnDiv.setOnClickListener { txt2.text = "/" }
        btnMinus.setOnClickListener { txt2.text = "-" }
        btnPlus.setOnClickListener { txt2.text = "+" }
        btnUm.setOnClickListener { txt2.text = "*" }
        btnEq.setOnClickListener {
            txt5.text = "="
            when (txt2.text) {
                "/" -> txt3.text = when {
                    d == 0.0 -> (txt3.text.toString().toDouble() / a).toString()
                    a == 0.0 -> (txt3.text.toString().toDouble() / d).toString()
                    txt3.text == "0" -> (a / d).toString()
                    else -> (txt3.text.toString().toDouble() / (a / d)).toString()

                }
                "*" -> txt3.text = when {
                    d == 0.0 -> (txt3.text.toString().toDouble() * a).toString()
                    a == 0.0 -> (txt3.text.toString().toDouble() * d).toString()
                    txt3.text == "0" -> (a * d).toString()
                    else -> (txt3.text.toString().toDouble() * (a * d)).toString()


                }

                "+" -> txt3.text = (txt3.text.toString().toDouble() + a + d).toString()
                "-" -> txt3.text = (txt3.text.toString().toDouble() - a - d).toString()
            }
            txt2.text = ""
            txt1.text = ""
            txt4.text = ""
            a = 0.0
            b = ""
            c = ""
            d = 0.0
        }

    }

    var a: Double = 0.0
    var b: String = ""
    var c: String = ""
    var d: Double = 0.0


}