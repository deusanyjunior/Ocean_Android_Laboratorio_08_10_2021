package com.oceanbrasil.ocean_android_introducao_07_10_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btTerceiraTela = findViewById<Button>(R.id.btTerceiraTela)

        btTerceiraTela.setOnClickListener {
            val terceiraTelaIntent = Intent(this, ThirdActivity::class.java)
            terceiraTelaIntent.putExtra("EXTRA_INFO", "Estava na Sexta!!")
            startActivity((terceiraTelaIntent))
        }

        /*
        Exercício da semana:
            - Adicionar um EditText na segunda tela
            - Enviar o valor dele para a Terceira
            - Exibir o valor dele no TextView da Terceira tela! =)
         */
    }
}