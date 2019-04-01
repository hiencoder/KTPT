package com.mrphonglinh.example.loigiaihaykt.base

import android.view.View
import androidx.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BasePresenter<V>(@Volatile var view: View?) {
    companion object {
        /*
        var compositeDisposables: CompositeDisposable
        Every method which will be part of presenter lyer will be added in it so we could dispose off them once they are no more in our use
        */
        var compositeDisposable: CompositeDisposable = CompositeDisposable()
    }

    init {
    }

    /**
     * return view
     */
    protected fun view(): View? {
        return view
    }

    @CallSuper
    fun unbindView() {
        if (compositeDisposable != null) {
            compositeDisposable.clear()
            compositeDisposable.dispose()
        }
        this.view = null
    }

    /**
     * add disposable
     */
    fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }
}