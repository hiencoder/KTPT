package com.mrphonglinh.example.loigiaihaykt.ui.intro

import android.os.Bundle
import com.mrphonglinh.example.loigiaihaykt.R
import com.mrphonglinh.example.loigiaihaykt.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*
import timber.log.Timber

public class IntroActivity : BaseActivity() {
    override fun onNetworkConnectionChanged(isConnected: Boolean) {
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun startScreen() {
    }

    override fun stopScreen() {
    }

    override fun setupToolbar() {
        //setSupportActionBar(toolbar)
        Timber.i("%s", "Abc")
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_intro
    }


    override fun initEvents() {
    }

}