package com.example.buttonclickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.buttonclickerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0

        binding.btnClick.setOnClickListener {

            count++

            binding.tvCount.text = count.toString()

            Toast.makeText(this, "Click number $count", Toast.LENGTH_SHORT).show()

        }

    }
}