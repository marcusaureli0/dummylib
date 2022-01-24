package com.hotmob.loglib

import android.util.Log

object PrintUtils {
    fun print(tag: String, message: String) {
        Log.d(tag, message)
    }
}