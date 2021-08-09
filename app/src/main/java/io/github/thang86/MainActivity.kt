package io.github.thang86

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *
 *    MainActivity.kt
 *
 *    Created by ThangTX on 09/08/2021
 *
 */
class MainActivity : AppCompatActivity() {
    // This variable use display result
    var scope: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * The func use increase the variable after every click
     */
    fun onIncrease() {
        scope += 1
    }

    /**
     * The func use decrease the variable after every click
     */
    fun onDecrease() {
        scope -= 1
    }
}