package com.example.latihanviewgroupwindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Bunga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bunga)
        supportActionBar?.title = "Bouquet Bunga"
    }
}