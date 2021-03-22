package org.d3if0088.lifecycle

import android.os.Handler
import android.os.Looper
import timber.log.Timber

class DessertTimer {
    var secondsCount = 0
    private var handler = Handler(Looper.getMainLooper())
    private lateinit var runnable: Runnable
    fun startTimer() {
        runnable = Runnable {
            secondsCount++
            Timber.i("Timer is at : $secondsCount")
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }
    fun stopTimer() {
        handler.removeCallbacks(runnable)
    }
}