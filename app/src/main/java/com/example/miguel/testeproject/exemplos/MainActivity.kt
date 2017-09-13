package com.example.miguel.testeproject.exemplos

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.miguel.testeproject.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var random = Random()


        updateUIButton.setOnClickListener { relativeLayout.setBackgroundColor(Color.parseColor("#51b46d"))
        curiosidadeTextView.text = random.nextInt(10).toString()

        }

        var cardume = listOf(Peixe("4", "Bacalhau", 10),
                Peixe("duas", "Dourado", 4),
                 null,
                Peixe("10", "Salmão", 1))
        var totalNadadeiras = 0
        for (peixe in cardume){
            totalNadadeiras += peixe?.numeroDeNadadeiras ?: 0
            peixe?.numeroDeNadadeiras = 4
        }


    }
}
