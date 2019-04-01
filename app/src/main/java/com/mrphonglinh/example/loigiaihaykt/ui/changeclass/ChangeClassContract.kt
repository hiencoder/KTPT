package com.mrphonglinh.example.loigiaihaykt.ui.changeclass

import com.mrphonglinh.example.loigiaihaykt.data.tag.ClassEntity

interface ChangeClassContract {
    interface ChangeClassView {
        fun loadListClassSuccess(list: MutableList<ClassEntity>)

        fun loadListClassError()
    }

    interface ChangeClassPresenter {
        fun loadListClass()
    }
}