package com.example.sextou_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun iniciaCadastro (view: View){

        val btn_cadastrar = findViewById<Button>(R.id.button2)
        btn_cadastrar.setOnClickListener {
            val intent = Intent(this, cadastroActivity::class.java)
            startActivity(intent)
        }
    }
}