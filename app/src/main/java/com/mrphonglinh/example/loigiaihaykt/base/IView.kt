package com.mrphonglinh.example.loigiaihaykt.base

interface IView {
    fun hideLoading()

    fun showLoading()

    fun loadError(e: Throwable)

    fun loadError(msg: String)
}