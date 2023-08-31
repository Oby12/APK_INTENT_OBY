package com.learn.apk_intent_oby

import android.app.Person
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObject : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val showDataWithObject: TextView = findViewById(R.id.show_data_with_object)

        val pperson = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<PersonOby>(EXTRA_PERSON,PersonOby::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<PersonOby>(EXTRA_PERSON)

        }
        if (pperson != null) {
            val text = "Name : ${pperson.name},\nEmail : ${pperson.email},\nAge : ${pperson.age},\nLocation : ${pperson.city}"
            showDataWithObject.text = text
        }
    }
}
