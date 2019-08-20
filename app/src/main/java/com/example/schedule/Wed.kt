package com.example.schedule

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_wed.*

class Wed : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wed)

        CardMon.setOnClickListener {
            val intent = Intent(
                this@Wed,
                Mon::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardTue.setOnClickListener {
            val intent = Intent(
                this@Wed,
                Tue::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardThu.setOnClickListener {
            val intent = Intent(
                this@Wed,
                Thu::class.java
            )
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        CardFri.setOnClickListener {
            val intent = Intent(
                this@Wed,
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

        materiAPL.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1CHWyDnQSnuQbu1Uns_Gw1wKP4OuQi6sg?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        materiSO.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/12g1r7qFq0c9p080feeu9qg0rqyokWLW5?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        materiJarkomdat.setOnClickListener {
            val url = "https://drive.google.com/drive/folders/1oPp4pDDbDDzJOFZNz90DlWepiMKUOjuE?usp=sharing"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}
