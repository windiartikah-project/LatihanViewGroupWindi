package com.example.latihanviewgroupwindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Snack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)
        supportActionBar?.title = "Bouquet Snack"
    }
}