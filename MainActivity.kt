package com.example.evaluasimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myappv2.R
import com.example.myappv2.Rupiahkonversi
import com.example.myappv2.Suhu


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRupiahkonversi: Button = findViewById(R.id.btn_Konversi_Rupiah)
        btnRupiahkonversi.setOnClickListener(this)

        val btnMoveKonversiSuhu: Button = findViewById(R.id.btn_suhu
        )
        btnMoveKonversiSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_Konversi_Rupiah -> {
                val konversiRupiah = Intent(this@MainActivity,Rupiahkonversi::class.java)
                startActivity(konversiRupiah)
            }
            R.id.btn_suhu -> {
                val konversiSuhu = Intent(this@MainActivity, Suhu::class.java)
                startActivity(konversiSuhu)
            }
        }
    }
}