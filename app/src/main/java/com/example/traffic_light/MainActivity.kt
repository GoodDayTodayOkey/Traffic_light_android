package com.example.traffic_light

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        red_button.setOnClickListener{
            textView.setText(R.string.red)
            root_layout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRed))
        }
        yellow_button.setOnClickListener{
            textView.setText(R.string.yellow)
            root_layout.setBackgroundColor(ContextCompat.getColor(this ,R.color.colorYellow))
        }
        green_button.setOnClickListener{
            textView.setText(R.string.green)
            root_layout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorGreen))
        }
    }
}
