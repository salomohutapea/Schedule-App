package com.example.schedule

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_thu.*

class Thu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thu)

        CardMon.setOnClickListener {
            val intent = Intent(
                this@Thu,
                Mon::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardTue.setOnClickListener {
            val intent = Intent(
                this@Thu,
                Tue::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardWed.setOnClickListener {
            val intent = Intent(
                this@Thu,
                Wed::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardFri.setOnClickListener {
            val intent = Intent(
                this@Thu,
                Fri::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        materiPemodelan.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1RHuKRHqTT100gvjA7uejWTtAOlWKgZTv?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        materiSismik.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1zZ1QU56_I12aR-3MVPZ1YOC7_UXyUD1r?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        materiIsis.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1wLjBTDMlqAyE9ZHn-dHYQ4KUdrPNbfsm?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}
