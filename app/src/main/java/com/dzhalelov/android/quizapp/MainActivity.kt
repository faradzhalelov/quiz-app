package com.dzhalelov.android.quizapp

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

        val startButton: Button = findViewById(R.id.startButton)
        val edtName : EditText = findViewById(R.id.edtName)

        startButton.setOnClickListener {

            if (edtName.text.isNotEmpty()) {
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, edtName.text.toString())
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Enter your name", Toast.LENGTH_SHORT).show()
            }


        }
    }
}