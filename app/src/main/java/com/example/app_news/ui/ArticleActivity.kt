package com.example.app_news.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.app_news.R
import com.example.app_news.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "ArticleActivity"
    }

    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}