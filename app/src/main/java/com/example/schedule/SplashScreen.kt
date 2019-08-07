package com.example.schedule

import android.content.Intent
import android.os.Bundle
import java.util.Calendar
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 1750 //1.75 seconds

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
            val calendar = Calendar.getInstance()
            val day = calendar.get(Calendar.DAY_OF_WEEK)

            when (day) {
                Calendar.SUNDAY -> {
                    val intent = Intent(applicationContext, Mon::class.java)
                    startActivity(intent)
                    finish()
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                }
                Calendar.MONDAY -> {
                    val intent = Intent(applicationContext, Mon::class.java)
                    startActivity(intent)
                    finish()
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                }
                Calendar.TUESDAY -> {
                    val intent = Intent(applicationContext, Tue::class.java)
                    startActivity(intent)
                    finish()
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                }
                Calendar.WEDNESDAY -> {
                    val intent = Intent(applicationContext, Wed::class.java)
                    startActivity(intent)
                    finish()
                }
                Calendar.THURSDAY -> {
                    val intent = Intent(applicationContext, Thu::class.java)
                    startActivity(intent)
                    finish()
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                }
                Calendar.FRIDAY -> {
                    val intent = Intent(applicationContext, Fri::class.java)
                    startActivity(intent)
                    finish()
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                }
                Calendar.SATURDAY -> {
                    val intent = Intent(applicationContext, Mon::class.java)
                    startActivity(intent)
                    finish()
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //Initialize the Handler
        mDelayHandler = Handler()

        //Navigate with delay
        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)
    }

    public override fun onDestroy() {

        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()
    }
}
