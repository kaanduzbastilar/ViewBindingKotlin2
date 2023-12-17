package com.kaanduzbastilar.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaanduzbastilar.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {  }

        binding.textView.text = "Test"
        binding.editText.setText("EditText Text")


    }
}