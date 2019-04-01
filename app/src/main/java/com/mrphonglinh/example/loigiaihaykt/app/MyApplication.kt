package com.mrphonglinh.example.loigiaihaykt.app

import android.app.Application
import com.mrphonglinh.example.loigiaihaykt.BuildConfig
import com.mrphonglinh.example.loigiaihaykt.R
import com.mrphonglinh.example.loigiaihaykt.base.ReleaseTree
import com.mrphonglinh.example.loigiaihaykt.receiver.NetworkReceiver
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber
import uk.co.chrisjenx.calligraphy.CalligraphyConfig


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        mInstance = this

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ReleaseTree())
        }
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }

    companion object {
        private var mInstance: MyApplication? = null
        @Synchronized
        fun getInstance(): MyApplication {
            return mInstance!!
        }
    }


    fun setConnectivityListener(connectivityListener: NetworkReceiver.ConnectivityReceiverListener) {
        NetworkReceiver.connectivityReceiverListener = connectivityListener
    }
}