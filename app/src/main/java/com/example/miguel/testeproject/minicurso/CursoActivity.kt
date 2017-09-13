package com.example.miguel.testeproject.minicurso

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.miguel.testeproject.R
import kotlinx.android.synthetic.main.activity_curso.*

class CursoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curso)

       val troca: TrocaCorETexto = TrocaCorETexto()
        updateTela(troca)
        buttonUpdate.setOnClickListener { updateTela(troca) }

    }

    private fun updateTela(troca: TrocaCorETexto) {
        textCuriosidade.text = troca.texto
        val colorAsInt = Color.parseColor(troca.color)
        relativeLayoutCurso.setBackgroundColor(colorAsInt)
    }
}
