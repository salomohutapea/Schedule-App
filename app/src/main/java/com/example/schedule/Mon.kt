package com.example.schedule

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mon.*

class Mon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon)

/*        CardMon.setOnClickListener {
            val intent = Intent(
                this@Mon,
                Mon::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }*/

        CardTue.setOnClickListener {
            val intent = Intent(
                this@Mon,
                Tue::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardWed.setOnClickListener {
            val intent = Intent(
                this@Mon,
                Wed::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardThu.setOnClickListener {
            val intent = Intent(
                this@Mon,
                Thu::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardFri.setOnClickListener {
            val intent = Intent(
                this@Mon,
                Fri::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        materiBasdat.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1M3eLPKU4-VZ5EKAcMMAfPX0V7hGCPJiT?usp=sharing"
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
