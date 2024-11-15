package com.example.adaptertp5

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adaptertp5.adapter.Myadapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById<ListView>(R.id.lv)
        val listePersonnes = arrayListOf(
            hashMapOf("nom" to "ALAMI", "prenom" to "Mohammed", "age" to "38"),
            hashMapOf("nom" to "ALAQUI", "prenom" to "Taha", "age" to "65"),
            hashMapOf("nom" to "IQBAL", "prenom" to "Imane", "age" to "15"),
            hashMapOf("nom" to "ALAMI", "prenom" to "Nada", "age" to "24"),
            hashMapOf("nom" to "SELLAM", "prenom" to "Issam", "age" to "12")
        )

        val adapter = Myadapter(this, listePersonnes)
        lv.adapter = adapter

    }
}