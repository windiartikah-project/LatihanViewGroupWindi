package com.example.latihanviewgroupwindi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "GN BOUQUET"

        val btnSnack: Button = findViewById(R.id.btn_snack)
        btnSnack.setOnClickListener(this)

        val btnBunga: Button = findViewById(R.id.btn_bunga)
        btnBunga.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_snack -> {
                val mSnack = Intent(this@MainActivity, Snack::class.java)
                startActivity(mSnack)
            }

            R.id.btn_bunga -> {
                val mBunga = Intent(this@MainActivity, Bunga::class.java)
                startActivity(mBunga)
            }
        }
    }
}