package com.example.schedule

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tue.*

class Tue : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tue)

        CardMon.setOnClickListener {
            val intent = Intent(
                this@Tue,
                Mon::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardWed.setOnClickListener {
            val intent = Intent(
                this@Tue,
                Wed::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardThu.setOnClickListener {
            val intent = Intent(
                this@Tue,
                Thu::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardFri.setOnClickListener {
            val intent = Intent(
                this@Tue,
                Fri::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        materiMatdislog.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1CHIaKjpiDxt3Yoj8wjFhLyLQRc7sbNR5?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}
