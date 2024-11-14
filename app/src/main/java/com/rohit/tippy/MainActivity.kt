package com.rohit.tippy

import android.os.Bundle
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    
//    private lateinit var etBaseAmount: EditText
//    private lateinit var seekBarTip: SeekBar
//    private lateinit var tvTipPercentLabel: TextView
//    private lateinit var tvTipAmount: TextView
//    private lateinit var tvTotalAmount: TextView

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        etBaseAmount = findViewById(R.id.etBaseAmount)
//        seekBarTip = findViewById(R.id.seekBarTip)
//        tvTipPercentLabel = findViewById(R.id.tvTipPercentLabel)
//        tvTipAmount = findViewById(R.id.tvTipAmount)
//        tvTotalAmount = findViewById(R.id.tvTotalAmount)
//
//        seekBarTip.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
//
//        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}