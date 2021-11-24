package com.example.myappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Rupiahkonversi : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtDolar: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rupiahkonversi)
        edtDolar = findViewById(R.id.edt_Dolar)
        tvResult = findViewById(R.id.tv_result)

        edtDolar = findViewById(R.id.edt_Dolar)
        tvResult = findViewById(R.id.tv_result)

        val btnKonversi: Button = findViewById(R.id.btn_calculate)
        btnKonversi.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputDolar = edtDolar.text.toString().trim()
            var isEmptyFields = false
            if (inputDolar.isEmpty()){
                isEmptyFields = true
                edtDolar.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields){
                val volume = inputDolar.toDouble()/15000
                tvResult.text = "$$volume"
            }
        }
    }
}