package com.example.rozklad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            var x = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
            var y = 2

            var wynik = mutableListOf<String>()

            while( x > 1 ){

                while ( x % y == 0){

                    val z = y.toString()
                    wynik += z
                    x /= y

                }

                y += 1

            }

            findViewById<TextView>(R.id.text1).text = wynik.toString()

        }

    }
}