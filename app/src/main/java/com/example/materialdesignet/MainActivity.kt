package com.example.materialdesignet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialdesignet.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
      lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            binding.textPreview.text = binding.editText.text.toString()
        }

    }
}