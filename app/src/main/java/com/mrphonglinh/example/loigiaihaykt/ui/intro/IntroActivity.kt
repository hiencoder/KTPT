package com.mrphonglinh.example.loigiaihaykt.ui.intro

import android.content.Intent
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import com.mrphonglinh.example.loigiaihaykt.R
import com.mrphonglinh.example.loigiaihaykt.adapter.IntroAdapter
import com.mrphonglinh.example.loigiaihaykt.base.BaseActivity
import com.mrphonglinh.example.loigiaihaykt.data.Intro
import com.mrphonglinh.example.loigiaihaykt.ui.changeclass.ChangeClassActivity
import com.mrphonglinh.example.loigiaihaykt.utils.AppConstants
import kotlinx.android.synthetic.main.activity_intro.*
import timber.log.Timber

public class IntroActivity : BaseActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_next -> handleNext()
            R.id.btn_skip -> handleSkip()
            R.id.btn_ok -> handleSkip()
        }
    }

    /**
     * Adapter
     */
    var introAdapter: IntroAdapter? = null
    /**
     * List intro screen
     */
    var listIntro: MutableList<Intro>? = mutableListOf()
    /**
     * position
     */
    var pageSelected: Int = 0

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
    }

    override fun initData(savedInstanceState: Bundle?) {
        //listIntro = ArrayList<Intro>()
        listIntro!!.add(Intro("Chọn môn, lớp", R.drawable.manual_1))
        listIntro!!.add(Intro("Tìm kiếm nhanh", R.drawable.manual_3))
        listIntro!!.add(Intro("Lưu bài viết", R.drawable.manual_5))
        listIntro!!.add(Intro("Chúc bạn học tập tốt", R.drawable.manual_1))

        introAdapter = IntroAdapter(this, listIntro!!)

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
        //Event viewpager
        vp_intro.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                pageSelected = position
                if (pageSelected == listIntro!!.size - 1) {
                    btn_next.setVisibility(View.GONE)
                    btn_ok.setVisibility(View.VISIBLE)
                } else {
                    btn_next.setVisibility(View.VISIBLE)
                    btn_ok.setVisibility(View.GONE)
                }
                sharedPrefUtils!!.putBoolean(AppConstants.IS_FIRST_LAUNCH, false)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        //Event button
        btn_next.setOnClickListener(this)
        btn_skip.setOnClickListener(this)
        btn_ok.setOnClickListener(this)
    }

    /**
     * Xử lý button next
     */
    private fun handleNext() {
        if (pageSelected < listIntro!!.size - 1) {
            //Nếu còn next đc
            pageSelected += 1
            vp_intro.setCurrentItem(pageSelected)
        } else {
            btn_next.visibility = View.GONE
            btn_ok.visibility = View.VISIBLE
        }
    }

    /**
     * Xử lý skip
     */
    private fun handleSkip() {
        //Save sharedPreferences
        sharedPrefUtils!!.putBoolean(AppConstants.IS_FIRST_LAUNCH, true)
        startActivity(Intent(this, ChangeClassActivity::class.java))
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

}