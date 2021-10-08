package com.oceanbrasil.ocean_android_introducao_07_10_2021

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buscar o botão pelo ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etTexto = findViewById<EditText>(R.id.etTexto)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btEnviar.setOnClickListener {
            /*
            Exercício:
            Construir um elemento de EditText no layout (entre o TextView e o Botão)
            Ao clicar no botão, pegar o que foi digitado no EditText e atualizar no texto do TextView
            */
            val textoDigitado = etTexto.text
            // tvResultado.text = "Olá, profs. Antonio Deusany e Paulo Salvatore!"
            tvResultado.text = textoDigitado
        }


    }
}
