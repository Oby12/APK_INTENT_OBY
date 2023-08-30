package com.learn.apk_intent_oby

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class after_btn_move_with_data : AppCompatActivity() {

    companion object{
        const val Extra_Age = "extra_age"
        const val Extra_name = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_btn_move_with_data)

        val tvDataReceived : TextView = findViewById(R.id.show_data)

        val name = intent.getStringExtra(Extra_name)
        val age = intent.getIntExtra(Extra_Age,0)

        val text = "your name is = $name \n and your age is = $age"
        tvDataReceived.text =text

    }
}