package com.example.timepicker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.timepicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setBackgroundDrawable(
            ContextCompat.getDrawable(
            this
            ,R.color.teal_200)
        )
        binding.timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            if(minute<10) {
                binding.timeText.text = "${hourOfDay}:0${minute}"
            }
            else{
                binding.timeText.text = "${hourOfDay}:${minute}"
            }
        }
    }
}