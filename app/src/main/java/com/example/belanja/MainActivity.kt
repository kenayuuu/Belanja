package com.example.belanja

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etTotalBelanja: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTotalBelanja = findViewById(R.id.etTotalBelanja)
        btnHitung = findViewById(R.id.btnHitung)
        tvHasil = this.findViewById(R.id.tvHasil)

        btnHitung.setOnClickListener {
            val totalBelanja = etTotalBelanja.text.toString().toIntOrNull() ?: 0
            var diskon = 0.0
            when {
                totalBelanja >= 1000000 -> diskon = totalBelanja * 0.3
                totalBelanja >= 500000 -> diskon = totalBelanja * 0.2
                totalBelanja >= 100000 -> diskon = totalBelanja * 0.1
            }
            tvHasil.text = "Diskon: Rp. ${diskon}"
        }
    }
}