package com.mrphonglinh.example.loigiaihaykt.adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import com.mrphonglinh.example.loigiaihaykt.data.Intro

class IntroAdapter : PagerAdapter() {
    var context: Context? = null
    var intros: List<Intro>? = null
    override fun isViewFromObject(p0: View, p1: Any): Boolean {
    }

    override fun getCount(): Int {
        if (intros != null) {
            return intros!!.size
        } else {
            return 0
        }
    }
}