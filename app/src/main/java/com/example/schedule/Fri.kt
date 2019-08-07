package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fri.*

class Fri : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fri)

        CardMon.setOnClickListener {
            val intent = Intent(
                this@Fri,
                Mon::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardTue.setOnClickListener {
            val intent = Intent(
                this@Fri,
                Tue::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardWed.setOnClickListener {
            val intent = Intent(
                this@Fri,
                Wed::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardThu.setOnClickListener {
            val intent = Intent(
                this@Fri,
                Thu::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}
