package com.example.app_news.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.app_news.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "SearchActivity"
    }

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}