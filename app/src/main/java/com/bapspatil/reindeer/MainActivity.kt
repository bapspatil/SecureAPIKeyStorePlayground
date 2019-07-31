package com.bapspatil.reindeer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bapspatil.reindeer.util.Keys
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        keyTextView.text = Keys.apiKey()
    }
}
