package com.example.sextou_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class cadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro)
    }

    fun cadastraArtista(view: View){
        val btn_Artist = findViewById<Button>(R.id.button3)
        btn_Artist.setOnClickListener {
            val intent = Intent(this, CadartistiActivity::class.java)
            startActivity(intent)
        }

    }

    fun cadastraSexto(view: View){
        val btn_Sexto = findViewById<Button>(R.id.button4)
        btn_Sexto.setOnClickListener {
            val intent = Intent(this, CadsextoActivity::class.java)
            startActivity(intent)
        }
    }

}