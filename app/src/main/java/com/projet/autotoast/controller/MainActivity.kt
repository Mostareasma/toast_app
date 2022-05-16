package com.projet.autotoast.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.projet.autotoast.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        get_started.setOnClickListener {
            var makeOrderIntent = Intent(this , MakeOrder::class.java)
            startActivity(makeOrderIntent)
        }
    }
}