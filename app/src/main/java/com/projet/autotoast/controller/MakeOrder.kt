package com.projet.autotoast.controller

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.projet.autotoast.R
import com.projet.autotoast.model.Order
import kotlinx.android.synthetic.main.activity_make_order.*
import java.sql.Time

class MakeOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_order)
        time.setIs24HourView(true);
        var smileyFace:Boolean = false
        var temperature:Int?
        var toastTime: TimePicker?
        validate.setOnClickListener() {
            if (temp.text.isEmpty()){
                Toast.makeText(this, getString(R.string.temp_empty), Toast.LENGTH_SHORT).show()
            }else{
                if (smiley.isChecked) {
                    smileyFace = true
                }
                temperature = temp.text.toString().toInt()
                val toastTime = time
                // Order
                var order:Order = Order(temperature!!,toastTime,smileyFace)
            }
        }
    }

}