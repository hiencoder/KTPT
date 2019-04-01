package com.mrphonglinh.example.loigiaihaykt.adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mrphonglinh.example.loigiaihaykt.R
import com.mrphonglinh.example.loigiaihaykt.data.Intro

class IntroAdapter : PagerAdapter {
    var context: Context? = null
    var intros: MutableList<Intro>? = null

    constructor(context: Context, intro: MutableList<Intro>) {
        this.context = context
        this.intros = intro
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return (view == `object`)
    }

    /**
     * return number item
     */
    override fun getCount(): Int {
        if (intros != null) {
            return intros!!.size
        } else {
            return 0
        }
    }

    /**
     *Fetch data
     */
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view: View = LayoutInflater.from(context).inflate(R.layout.item_intro, container, false)
        var ivIntro: ImageView = view.findViewById(R.id.iv_intro)
        var tvIntro: TextView = view.findViewById(R.id.tv_intro)
        var intro = intros!!.get(position)
        tvIntro.setText(intro.title)
        Glide.with(context!!).load(intro.image).into(ivIntro)
        container.addView(view)
        return view
    }

    /**
     *Remove item
     */
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}