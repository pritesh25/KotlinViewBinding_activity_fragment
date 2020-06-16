package com.vinrak.kotlinviewbinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vinrak.kotlinviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.tvName.text = "This is View Binding"
        binding.tvName.setOnClickListener {
            Log.d("MainActivity", "clicked")
        }

    }
}