package com.mrphonglinh.example.loigiaihaykt.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPrefUtils {
    private var sharedPreferences: SharedPreferences
    private var editor: SharedPreferences.Editor

    constructor(context: Context) {
        sharedPreferences = context.getSharedPreferences(AppConstants.PREF_NAME, Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
    }

    fun putBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value).commit()
    }

    fun getBoolean(key: String, defValue: Boolean): Boolean {
        return sharedPreferences.getBoolean(key, defValue)
    }

    fun putInt(key: String, value: Int) {
        editor.putInt(key, value).commit()
    }

    fun getInt(key: String, defValue: Int): Int {
        return sharedPreferences.getInt(key, defValue)
    }

    fun putLong(key: String, value: Long) {
        editor.putLong(key, value).commit()
    }

    fun getLong(key: String, defValue: Long): Long {
        return sharedPreferences.getLong(key, defValue)
    }

    fun putString(key: String, value: String) {
        editor.putString(key, value).commit()
    }

    fun getString(key: String, defValue: String): String {
        return sharedPreferences.getString(key, defValue)
    }

    fun putFloat(key: String, value: Float) {
        editor.putFloat(key, value).commit()
    }

    fun getFloat(key: String, defValue: Float): Float {
        return sharedPreferences.getFloat(key, defValue)
    }
}