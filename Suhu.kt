package com.example.myappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Suhu : AppCompatActivity(),View.OnClickListener {

    private lateinit var edtSuhu: EditText
    private lateinit var tvResultFahrenheit: TextView
    private lateinit var tvResultKelvin: TextView
    private lateinit var tvResultReamus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suhu)

        edtSuhu = findViewById(R.id.edt_suhu)
        tvResultFahrenheit = findViewById(R.id.tc_result1)
        tvResultReamus = findViewById(R.id.tc_result2)
        tvResultKelvin = findViewById(R.id.tc_result3)

        val btnKonversiSuhu: Button = findViewById(R.id.btn_suhu)
        btnKonversiSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_suhu){
            val inputSuhu = edtSuhu.text.toString().trim()
            var isEmptyFields = false
            if (inputSuhu.isEmpty()){
                isEmptyFields = true
                edtSuhu.error = "Field ini tidak boleh kosong ya neng"
            }
            if (!isEmptyFields){
                val volume1 = ((9 * inputSuhu.toDouble()) / 5) + 32
                tvResultFahrenheit.text = "Suhu Fahrenheit : $volume1 "
                val volume2 = (4 * inputSuhu.toDouble()) / 5
                tvResultReamus.text = "Suhu Reamus : $volume2"
                val volume3 = inputSuhu.toDouble() + 273.15
                tvResultKelvin.text = "Suhu Kelvin : $volume3"

            }
        }
    }
}