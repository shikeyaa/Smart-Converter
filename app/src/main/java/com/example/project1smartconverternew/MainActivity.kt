package com.example.project1smartconverternew

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var userCels = findViewById<TextView>(R.id.editTextNumberSigned)
        var userFahr = findViewById<TextView>(R.id.editTextNumberSigned2)
        var userResults = findViewById<TextView>(R.id.txtResult)
        var convertButton = findViewById<Button>(R.id.cToF)
        var convertButtonTwo = findViewById<Button>(R.id.fToC)
        var resetButton = findViewById<Button>(R.id.btnReset)

        convertButton.setOnClickListener{
            val userInputCels = userCels.text.toString().toFloat()
            val convertButton = userInputCels * 9/5 + 32
            userResults.setText(convertButton.toString())

            resetButton.setOnClickListener {
                userCels.setText("")
                userFahr.setText("")
                userResults.setText("")
            }
        }
        convertButtonTwo.setOnClickListener {
            val userInputFahr = userFahr.text.toString().toFloat()
            val convertButtonTwo = (userInputFahr - 32) * 5/9
            userResults.setText(convertButtonTwo.toString())
        }
    }
}