package com.learn.apk_intent_oby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() , View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        BtnMoveActivity.setOnClickListener(this)

        val btnMovedWithData : Button = findViewById(R.id.btn_move_activity_with_data)
        btnMovedWithData.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val MoveIntent = Intent(this@MainActivity, after_btn_move_activity::class.java)
                startActivity(MoveIntent)
            }

            R.id.btn_move_activity_with_data -> {
                val MoveWithData = Intent(this@MainActivity,after_btn_move_with_data::class.java)
                MoveWithData.putExtra(after_btn_move_with_data.Extra_name, "Bobby Saputra")
                MoveWithData.putExtra(after_btn_move_with_data.Extra_Age, 19)
                startActivity(MoveWithData)
            }
        }
    }
}