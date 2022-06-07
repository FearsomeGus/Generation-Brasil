package com.example.todo_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        val intentPrimeira = Intent (this, MainActivity::class.java)

        buttonVoltar.setOnClickListener{
            finish()
        }
    }
}