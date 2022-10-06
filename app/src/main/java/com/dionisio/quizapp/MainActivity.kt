package com.dionisio.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btn_start)
        val inputName = findViewById<EditText>(R.id.input_name)

        btnStart.setOnClickListener {
            if(inputName.text.toString().isNotEmpty()){

                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish() // For close this activity

            }else{
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}