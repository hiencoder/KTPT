package com.mrphonglinh.example.loigiaihaykt.data.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

abstract class BaseEvent : Serializable {
    @Expose
    @SerializedName("title")
    protected var title: String = ""

    @Expose
    @SerializedName("is_link")
    protected var isLink: Int = 0
}