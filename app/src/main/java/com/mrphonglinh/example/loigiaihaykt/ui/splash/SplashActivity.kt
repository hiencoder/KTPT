package com.mrphonglinh.example.loigiaihaykt.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.content.ContextCompat.startActivity
import android.text.TextUtils
import com.github.ybq.android.spinkit.style.FadingCircle
import com.mrphonglinh.example.loigiaihaykt.R
import com.mrphonglinh.example.loigiaihaykt.base.BaseActivity
import com.mrphonglinh.example.loigiaihaykt.ui.changeclass.ChangeClassActivity
import com.mrphonglinh.example.loigiaihaykt.ui.intro.IntroActivity
import com.mrphonglinh.example.loigiaihaykt.ui.main.MainActivity
import com.mrphonglinh.example.loigiaihaykt.utils.AppConstants

public class SplashActivity : BaseActivity(), SplashContract.SplashView {
    /**
     * Biến kiểm tra lần đầu chạy app
     */
    var isFirsTLaunch: Boolean = false

    /**
     * Biến tên lớp
     */
    var classTitle: String = ""

    /**
     * Biến subjectId
     */
    var subjectId: String = ""

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
    }

    override fun initData(savedInstanceState: Bundle?) {
        isFirsTLaunch = sharedPrefUtils!!.getBoolean(AppConstants.IS_FIRST_LAUNCH, true)
        classTitle = sharedPrefUtils!!.getString(AppConstants.KEY_CLASS_TITLE, "")
        subjectId = sharedPrefUtils!!.getString(AppConstants.KEY_SUBJECT_ID, "")
        showLoading()
        if (isFirsTLaunch) {
            //Nếu lần đầu chạy app
            Handler().postDelayed({
                startActivity(Intent(this@SplashActivity, IntroActivity::class.java))
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
            }, 4000)
        } else {
            if (TextUtils.isEmpty(subjectId)) {
                //Nếu chưa chọn môn học
                Handler().postDelayed({
                    //open main
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                }, 4000)
            } else {
                Handler().postDelayed({
                    startActivity(Intent(this@SplashActivity, ChangeClassActivity::class.java))
                    finish()
                }, 4000)
            }
        }
    }

    //    Init progressbar
    private fun initProgressBar() {
        progressBar = findViewById(R.id.pb_loading)
        var fadeCircleSprite = FadingCircle()
        progressBar!!.indeterminateDrawable = fadeCircleSprite
    }

    override fun startScreen() {
    }

    override fun stopScreen() {
    }

    override fun setupToolbar() {
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initEvents() {
    }

}