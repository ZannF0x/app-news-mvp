package com.example.app_news.utils

import java.text.SimpleDateFormat
import java.util.*


object Utils {

    fun getDateFormatted(date: String): String? {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val strDate = dateFormat.parse(date)
        strDate?.let {
            return it.toString()
        }
        return null
    }

}