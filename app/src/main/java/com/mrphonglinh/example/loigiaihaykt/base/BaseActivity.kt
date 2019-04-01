package com.mrphonglinh.example.loigiaihaykt.base

import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.github.ybq.android.spinkit.style.FadingCircle
import com.mrphonglinh.example.loigiaihaykt.R
import com.mrphonglinh.example.loigiaihaykt.app.MyApplication
import com.mrphonglinh.example.loigiaihaykt.receiver.NetworkReceiver
import com.mrphonglinh.example.loigiaihaykt.utils.SharedPrefUtils

abstract class BaseActivity : AppCompatActivity(), IView,
    NetworkReceiver.ConnectivityReceiverListener {
    /*Đặt các đoạn mã xử lý chung cho các activity
    * 1. Code cho nút back.
    * 2. Code cho actionbar*/
    /**
     * A progressbar showing a progress indicator and an optional text message or
     * view.
     */
    protected var progressBar: ProgressBar? = null

    @LayoutRes
    protected abstract fun getLayoutId(): Int

    protected abstract fun setupToolbar()

    protected abstract fun initData(savedInstanceState: Bundle?)

    protected abstract fun initEvents()

    protected abstract fun startScreen()

    protected abstract fun stopScreen()

    var backPress: Long? = null

    /**
     * Biến SharedPrefUtils
     */
    protected var sharedPrefUtils: SharedPrefUtils? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        sharedPrefUtils = SharedPrefUtils(this)
        setupToolbar()
        initProgressBar()
        initData(savedInstanceState)
        initEvents()
    }

    //    Init progressbar
    private fun initProgressBar() {
        progressBar = findViewById(R.id.pb_loading)
        val fadeCircleSprite = FadingCircle()
        if (progressBar != null) {
            progressBar!!.indeterminateDrawable = fadeCircleSprite
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        //register connection status listener
        MyApplication.getInstance().setConnectivityListener(this)
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        stopScreen()
    }

    override fun onDestroy() {
        super.onDestroy()
        System.gc()
        System.runFinalization()
        if (progressBar != null && progressBar!!.isShown) {
            progressBar!!.visibility = View.GONE
        }
    }

    /*ProgressDialog*/
    protected var mProgressDialog: ProgressDialog? = null

    fun showProgress(
        msgResId: Int,
        keyListener: DialogInterface.OnKeyListener?
    ) {
        if (isFinishing)
            return
        if (mProgressDialog!!.isShowing) {
            return
        }
        if (msgResId != 0) {
            mProgressDialog?.setMessage(resources.getString(msgResId))
        }
        if (keyListener != null) {
            mProgressDialog?.setOnKeyListener(keyListener)
        } else {
            mProgressDialog?.setCancelable(false)
        }
        mProgressDialog?.show()
    }

    /**
     * @param isCancel
     */
    fun setCancelableProgress(isCancel: Boolean) {
        if (mProgressDialog != null) {
            mProgressDialog?.setCancelable(true)
        }
    }

    /**
     * cancel progress dialog.
     */
    fun dismissProgress() {
        if (mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog?.dismiss()
        }
    }

    /**
     * Hide progressbar
     */
    override fun hideLoading() {
        if (progressBar != null && progressBar!!.isShown) {
            progressBar!!.visibility = View.GONE
        }
    }

    /**
     * Show progressbar
     */
    override fun showLoading() {
        if (progressBar != null && !progressBar!!.isShown) {
            progressBar!!.visibility = View.VISIBLE
        }
        //showProgress(R.string.loading, null)
    }

    override fun loadError(e: Throwable) {
        showHttpError(e)
    }

    override fun loadError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    /*
    Improper handling in real case
     */
    protected fun showHttpError(e: Throwable) {
        loadError(e.localizedMessage)
    }

    //Hide keyboard
    protected fun hideKeyboard() {
        val currentFocus = currentFocus
        if (currentFocus != null) {
            (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
                .hideSoftInputFromWindow(
                    currentFocus.windowToken,
                    InputMethodManager.RESULT_UNCHANGED_SHOWN
                )
        }
    }

    /**
     * @param view
     */
    protected fun setUpUi(view: View) {
        if (view !is EditText) {
            view.setOnTouchListener { v, event ->
                hideKeyboard()
                false
            }
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val innerView = view.getChildAt(i)
                setUpUi(innerView)
            }
        }
    }

    //Set color for status bar and navigation bar
    protected fun setColorStatusBar() {
        if (Build.VERSION.SDK_INT >= 21) {
            //get window
            val window = window
            window.addFlags(Integer.MIN_VALUE)
            //Set color for status bar
            window.statusBarColor = Color.parseColor("#9E9E9E")
            //set color for navigation bar
            window.navigationBarColor = Color.parseColor("#000000")
        }
    }

    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        super.onBackPressed()
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_LONG).show()
        Handler().postDelayed(Runnable {
            doubleBackToExitPressedOnce = false
        },2000)
    }
}