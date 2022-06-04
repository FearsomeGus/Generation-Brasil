package com.example.rolagem_dados

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
            rolarDados6(6)
        }
        buttonD12.setOnClickListener {
            rolarDados12(12)
        }
        buttonD20.setOnClickListener {
            rolarDados20(20)
        }

    }

    private fun rolarDados6(lados: Int) {
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageView)

        when (rolagem) {
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)

        }
    }

    private fun rolarDados12(lados: Int) {
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageView)

        when (rolagem) {
            1 -> image.setImageResource(R.drawable.d10_1)
            2 -> image.setImageResource(R.drawable.d10_2)
            3 -> image.setImageResource(R.drawable.d10_3)
            4 -> image.setImageResource(R.drawable.d10_4)
            5 -> image.setImageResource(R.drawable.d10_5)
            6 -> image.setImageResource(R.drawable.d10_6)
            7 -> image.setImageResource(R.drawable.d10_7)
            8 -> image.setImageResource(R.drawable.d10_8)
            9 -> image.setImageResource(R.drawable.d10_9)
            10 -> image.setImageResource(R.drawable.d10_10)
            11 -> image.setImageResource(R.drawable.d10_11)
            12 -> image.setImageResource(R.drawable.d10_12)

        }
    }

    private fun rolarDados20(lados: Int) {
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageView)

        when (rolagem) {
            1 -> image.setImageResource(R.drawable.d20_1)
            2 -> image.setImageResource(R.drawable.d20_2)
            3 -> image.setImageResource(R.drawable.d20_3)
            4 -> image.setImageResource(R.drawable.d20_4)
            5 -> image.setImageResource(R.drawable.d20_5)
            6 -> image.setImageResource(R.drawable.d20_6)
            7 -> image.setImageResource(R.drawable.d20_7)
            8 -> image.setImageResource(R.drawable.d20_8)
            9 -> image.setImageResource(R.drawable.d20_9)
            10 -> image.setImageResource(R.drawable.d20_10)
            11 -> image.setImageResource(R.drawable.d20_11)
            12 -> image.setImageResource(R.drawable.d20_12)
            13 -> image.setImageResource(R.drawable.d20_13)
            14 -> image.setImageResource(R.drawable.d20_14)
            15 -> image.setImageResource(R.drawable.d20_15)
            16 -> image.setImageResource(R.drawable.d20_16)
            17 -> image.setImageResource(R.drawable.d20_17)
            18 -> image.setImageResource(R.drawable.d20_18)
            19 -> image.setImageResource(R.drawable.d20_19)
            20 -> {
                image.setImageResource(R.drawable.d20_20)
                Toast.makeText(this, "DOUBLE DAMAGE", Toast.LENGTH_LONG).show()
            }


        }
    }
}



